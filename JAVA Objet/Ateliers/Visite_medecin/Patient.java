package bo;

import java.time.LocalDate;

public class Patient {
	private String nom;
	private String prenom;
	private String telephone;
	private char sexe;
	private long numeroSecu;
	private LocalDate dateDeNaissance;
	private String commentaires;
	private Adresse adresse; //Ajout Atelier 4
	
	public Patient() {
		
	}
	
	public Patient(String nom, String prenom, String telephone, char sexe, long numeroSecu, LocalDate dateDeNaissance,
			String commentaires,Adresse adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.sexe = sexe;
		this.numeroSecu = numeroSecu;
		this.dateDeNaissance = dateDeNaissance;
		this.commentaires = commentaires;
		this.adresse=adresse;//Ajout Atelier 4
		
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
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public char getSexe() {
		return sexe;
	}
	public void setSexe(char sexe) {
		this.sexe = sexe;
	}
	public long getNumeroSecu() {
		return numeroSecu;
	}
	public void setNumeroSecu(long numeroSecu) {
		this.numeroSecu = numeroSecu;
	}
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public String getCommentaires() {
		return commentaires;
	}
	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}
	
	//Ajout Atelier 4
	public Adresse getAdresse() {
		return adresse;
	}
	
	//Ajout Atelier 4
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public void afficher() {
		System.out.println("Nom            : " + this.nom);
		System.out.println("Prenom         : " + this.prenom);
		System.out.println("Telephone      : " + this.telephone);
		System.out.println("Sexe           : " + this.sexe);
		System.out.println("Numero secu    : " + this.numeroSecu);
		System.out.println("Date naissance : " + this.dateDeNaissance);
		System.out.println("Commentaires   : " + this.commentaires);
		System.out.println("Adresse   : " );
		adresse.afficher();//Ajout Atelier 4
	}
}
