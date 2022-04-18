package bo;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private String nom;
	private String prenom;
	private Adresse adresse;
	private List<Location> locations;
	public Client(String nom, String prenom, Adresse adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		/*
		 * Des que je cree mon instance, j'initialise mes locations
		 * Il n'y a pas de locations par defaut, mais la liste existe :
		 *    je pourrai donc y ajouter des elements par la suite
		 *    (si on essaie d'ajouter un element a quelque chose qui n'existe pas
		 *        -> NullPointerException)
		 */
		
		this.locations = new ArrayList<>();
	}
	
	public void ajouterLocation(Location location) {
		locations.add(location);
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public List<Location> getLocations() {
		return locations;
	}
	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}
}
