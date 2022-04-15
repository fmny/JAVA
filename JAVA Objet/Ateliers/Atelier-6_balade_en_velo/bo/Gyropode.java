package bo;

import java.time.LocalDate;

public class Gyropode extends Gyro {
public static float tarif = 29.90f ;
public String tailleMin;


public Gyropode(String marque,String modele,LocalDate dateAchat,int autonomie,String tailleMin) {
	super(marque,modele,dateAchat,autonomie);
	this.tailleMin = tailleMin;
}//on ne met pas le tarif car il est fixe



	public float getTarif() {
	return tarif;
}


public void setTarif(float tarif) {
	this.tarif = tarif;
}


public String getTailleMin() {
	return tailleMin;
}


public void setTailleMin(String tailleMin) {
	this.tailleMin = tailleMin;
}

@Override //Apporte de la clarté (pas obligatoire)
	public void afficher() {
		System.out.print("Gyropode ");
		super.afficher();
		/*System.out.print(super.getMarque());
		System.out.print(super.getModele());*/
		System.out.print(":....................");
		System.out.println("  " + tarif+"0€/heure");//Vieille Technique de Varcreux (voir E.Cassin)
		System.out.print("      * Acheté le ");
		System.out.println(super.getDate());
		System.out.print("      * ");
		System.out.println(super.getAutonomie()+"km d'autonomie");
		System.out.println("      * Taille minimum : "+tailleMin);
		}
	
	
	/*
	//Tentative de réecriture de la méthode toString:
	public String toString() {
		   return "Gyropode  " +  super.getMarque() +super.getModele()+
		   ":....................." + "Tarif     : " + tarif+"€"+
			  "Acheté le " + super.getDate()+"       "+super.afficher();
		   //Je ne peux pas additionner String+Void
		   //(String)super.afficher() ne fonctionne pas
		   //Cannot cast void to String
		}
		*/

//toString
@Override
public String toString() {
	String resultat="Gyropode";
	
	/*"super" désigne la classe directement au dessus dans l'heritage (Gyro)
	*le toString() de Gyropode appelle le toString de Gyro
	*qui appelle le toString de Cycle
	*Si toString n'existe pas dans Gyro, il va chercher dans la classe 
	*mere de Gyro (Cycle), puis dans Object
	*/
	
	resultat+=super.toString();//A finir
	resultat+="\n* ";
	resultat+= "Taille minimum : ";
	resultat+=tailleMin;
	return resultat;
}
	
}
