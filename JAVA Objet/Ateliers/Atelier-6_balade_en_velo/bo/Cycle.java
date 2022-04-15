package bo;

import java.time.LocalDate;



public abstract class Cycle {
	protected String marque;
	protected String modele;
	protected LocalDate date;
	
	public Cycle() {}
	
	
	public Cycle(String marque, String modele, LocalDate date) {
		this.marque = marque;
		this.modele = modele;
		this.date = date;
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
	
	
	public LocalDate getDate() {
		return date;
	}
	
	
	public void setDate(LocalDate date) {
		this.date = date;
	}


	public void afficher() {
		System.out.print(this.getMarque()+" ");
		System.out.print(this.getModele());
		
	}
	
	//System.out.print(getModele());
	/*
	 System.out.print(":.....................");
	System.out.println("  " + tarif+"0€/heure");//Vieille Technique de Varcreux (voir E.Cassin)
	System.out.print("      * Acheté le ");//Faire un gros "." ???
	System.out.println(super.getDate());
	System.out.print("      * ");super.afficher();
	System.out.println("      * Taille minimum : "+tailleMin);
	*/
	
//Faire toString
	
}
