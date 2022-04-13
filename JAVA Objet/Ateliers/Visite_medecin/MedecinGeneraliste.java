package bo;

import java.time.LocalDateTime;

public class MedecinGeneraliste {
	private String nom;
	private String prenom;
	private String telephone;
	private static int tarif = 25;
	private Adresse adresse; //Ajout Atelier 4
	private Creneau[] tableauCreneau ;
	
	
	public MedecinGeneraliste(String nom, String prenom, String telephone, Adresse adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.adresse = adresse;
		tableauCreneau = new Creneau[15];
	}

	public void ajouterCreneau(Creneau creaneauAAjouter) {
		int cpt = 0;
		boolean insere = false;
		// tant que je suis dans les limites du tableau (controle avec length)
		// ET que l'element n'a pas encore ete insere
		// je boucle
		while (cpt < tableauCreneau.length && !insere) {
			// une case null est une case vide, je peux proceder a l'insertion
			if (tableauCreneau[cpt] == null) {
				// Au moment ou on affecte un creneau a un medecin
				tableauCreneau[cpt] = creaneauAAjouter;
				
				// On en profite pour affecter egalement ce creneau (this) 
				// au medecin en question
				// this designe l'instance de creneau en cours
				tableauCreneau[cpt].setMedecin(this);
				
				// Equivalent a 
				// eleveAAjouter.setGroupe(this);
				
				insere = true;
			}
			cpt++;
		}
		if (!insere) {
			System.err.println("Impossible d'inserer un nouveau creneau");
		}
	}
	
	/*
	 * Attention a cette methode afficher
	 * Elle appelle la methode afficher de eleve
	 * Qui a son tour réappelle cette methode
	 * Resultat --> boucle infinie car appel mutuel
	 */
	

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

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public static int getTarif() {
		return tarif;
	}

	public static void setTarif(int tarif) {
		MedecinGeneraliste.tarif = tarif;
	}
	
	
	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public void afficher() {
		System.out.println("Nom       : " + this.nom);
		System.out.println("Prenom    : " + this.prenom);
		System.out.println("Telephone : " + this.telephone);
		System.out.println("Tarif     : " + tarif);
		if (adresse!=null) {
		System.out.println("Adresse: " );
		adresse.afficher();//Attention ne pas mettre adresse.Afficher 
		//dans le print (puisque afficher() renvoie void)
		}
		for (Creneau current : tableauCreneau) {
			if (current != null) {
				current.afficher();
			}
		}
		
	}
	

}
