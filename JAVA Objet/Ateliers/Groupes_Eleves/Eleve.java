package Eleve_groupe;

public class Eleve {
	private String nom;
	private String prenom;
	private Groupe groupe;
	private boolean coupable;
	
	public Eleve()
	{}
	
	public Eleve(String nom, String prenom)
	{
	this.nom=nom;
	this.prenom=prenom;
	}
	
	/*A eviter*/
	/*
	public Eleve(String nom, String prenom, Groupe groupe)
	{
	this.nom=nom;
	this.prenom=prenom;
	this.groupe=groupe;	
	}
	*/
	
	
	
	//Getter et Setter
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
	
	public Groupe getGroupe() {
		return groupe;
	}
	
	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}
	
	//isCoupable: nomenclature pour un boolean
	public boolean isCoupable() {
		return coupable;
	}
	
	public void setCoupable(boolean coupable) {
		this.coupable = coupable;
	}
	
	//Fin Getter et Setter
	
	
	
	
	
	
	
	
	
	public Groupe getGroupe()
	{return groupe;}
	
	public void setGroupe(Groupe groupe)
	{this.groupe=groupe;}
	
	
	
	
}
