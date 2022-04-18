package bo;

import java.time.LocalDate;

public abstract class Cycle {
	protected String marque;
	protected String modele;
	protected LocalDate dateAchat;
	
	// Suggere que je peux avoir des velos
	// avec des prix differents
	//protected double tarif;
	
	public Cycle(String marque, String modele, LocalDate dateAchat) {
		this.marque = marque;
		this.modele = modele;
		this.dateAchat = dateAchat;
	}
	
	// J'impose que toutes mes classes filles
	// doivent disposer d'une methode getTarif (qui renvoie un double)
	// "Je sais qu'un cycle dispose d'un tarif"
	public abstract double getTarif();

	// La methode toString() est une methode de Object
	// C'est donc bien une substitution (@Override)
	@Override
	public String toString() {
		String resultat = "";
		// Je concatene une chaine vide "" avec le modele
		resultat += modele;
		resultat += " ";
		resultat += marque;
		resultat += " :................";
		resultat += getTarif(); // on fait confiance au polymorphisme pour me trouver la bonne methode getTarif
		resultat += "€ / heure\n";
		resultat += " * Acheté le : ";
		resultat += dateAchat.toString();
		
		return resultat;
	}
	
	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public LocalDate getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(LocalDate dateAchat) {
		this.dateAchat = dateAchat;
	}
}
