package bo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Magasin {
	private List<Cycle> cyclesDisponibles;
	private List<Location> locations;
	private Map<String, Client> clients;

	public Magasin() {
		/* On pense a initialiser nos collections (cf commentaire dans Client) */
		cyclesDisponibles = new ArrayList<>();
		locations = new ArrayList<>();
		clients = new HashMap<>();
	}
	
	public void ajouterArticle(Cycle cycle) {
		cyclesDisponibles.add(cycle);
	}
	
	public Cycle chercherArticle(String nom) {
		// On part du postulat que le cycle recherche n'existe pas
		Cycle resultat = null;
		
		// Puis on parcourt chaque cycle pour comparer le modele au nom fourni
		for (Cycle current : cyclesDisponibles) {
			// Si on trouve le modele, on l'affecte au resultat
			if (current.getModele().equalsIgnoreCase(nom)) {
				resultat = current;
			}
		}
		return resultat;
	}
	
	public void supprimerArticle(Cycle cycle) {
		cyclesDisponibles.remove(cycle); // C'est pratique les listes...
	}
	
	public void ajouterLocation(Location location) {
		locations.add(location);
	}
	
	public List<Location> consulterLocationsEnCours() {
		// On commence par creer une liste vide, qui sera notre resultat
		List<Location> resultat = new ArrayList<>();
		// On parcourt les locations disponibles, et si elles correspondent
		// a notre critere, on les copie dans la liste resultat
		for (Location current : locations) {
			if (current.getFin() == null) {
				resultat.add(current);
			}
		}
		return resultat;
	}
	
	/*
	 * Methode non demandee, permet d'ajouter un client a notre collection de clients
	 * on cree une paire "pour un nom donne, je retrouve le client associe"
	 */
	public void ajouterClient(Client client) {
		clients.put(client.getNom(), client);
	}
	
	public Client rechercherClient(String nom) {
		return clients.get(nom);
	}
	
	public double calculerMontant(Client client) {
		// On part d'un montant nul
		double montant = 0;
		
		// Et on y ajouter le prix de chacune des locations non reglees
		for (Location currentLocation : client.getLocations()) {
			if (!currentLocation.isRegle()) {
				montant += currentLocation.calculerMontant();
			}
		}
		
		return montant;
	}
	
	@Override
	public String toString() {
		String resultat = "";
		// Je fais une variable current de type Cycle qui prend successivement les valeurs de cyclesDisponibles
		for (Cycle current : cyclesDisponibles) {
			resultat += " - ";
			resultat += current.toString();
			resultat += "\n";
		}
		return resultat;
	}
}
