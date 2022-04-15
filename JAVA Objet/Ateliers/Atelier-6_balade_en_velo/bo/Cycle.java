package bo;

import java.time.LocalDate;


public abstract class Cycle {
	protected String marque;
	protected String modele;
	protected LocalDate dateAchat;
	
	public Cycle() {}
	
	
	public Cycle(String marque, String modele, LocalDate dateAchat) {
		this.marque = marque;
		this.modele = modele;
		this.dateAchat = dateAchat;
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
		return dateAchat;
	}
	
	
	public void setDate(LocalDate dateAchat) {
		this.dateAchat = dateAchat;
	}


	public void afficher() {
		System.out.print(this.getMarque()+" ");
		System.out.print(this.getModele());
		
	}
	
	//System.out.print(getModele());
	/*
	 System.out.print(":.....................");
	System.out.println("  " + tarif+"0�/heure");//Vieille Technique de Varcreux (voir E.Cassin)
	System.out.print("      * Achet� le ");//Faire un gros "." ???
	System.out.println(super.getDate());
	System.out.print("      * ");super.afficher();
	System.out.println("      * Taille minimum : "+tailleMin);
	*/
	
//Faire toString
	
	/*Ajout Correction
	 * Oblige � avoir une m�thode getTarif dans toutes les classes filles
	 * sauf Gyro qui est une classe abstraite
	 */
	public abstract float getTarif();
	
	@Override
	//La m�thode toString est une m�thode de Object
	//c'est donc bien une substitution
	public String toString() {
		String resultat="";
		//Je concatene une chaine vide avec ""avec la marque et le modele
		resultat+=modele;
		resultat+=" ";
		resultat+=marque;
		resultat+=" :...........";
		//on peut utiliser getTarif car c'est une m�thode abstraite
		//de Cycle, donc toutes les classes filles l'auront
		//on fait confiance au polymorphisme pour trouver la bonne m�thode
		resultat+= getTarif(); 
		resultat+="� / heure\n";
		resultat+="Achet� le : ";
		resultat+=dateAchat.toString();
		
		return resultat;
		
		
		//il existe aussi resultat.concat
		//StringBuilde.... pour concat�ner des cha�nes de caract�res
	}
	
	
	
}