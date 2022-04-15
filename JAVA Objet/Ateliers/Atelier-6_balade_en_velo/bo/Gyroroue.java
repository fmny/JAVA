package bo;

import java.time.LocalDate;

public class Gyroroue extends Gyro {
public static float tarif = 18.9f;

	public Gyroroue() {
		super();
	}//on ne met pas le tarif car il est fixe

	public Gyroroue(String marque,String modele,LocalDate dateAchat,int autonomie) {
		super(marque,modele,dateAchat,autonomie);
	}//on ne met pas le tarif car il est fixe


	public float getTarif() {
		return tarif;
	}


	public void setTarif(float tarif) {
		this.tarif = tarif;
	}

	@Override //Pas obligatoire
	public void afficher() {
		System.out.print("Gyroroue ");
		super.afficher();
		/*System.out.print(super.getMarque());
		System.out.print(super.getModele());*/
		System.out.print(":......................");
		System.out.println("  " + tarif+"0�/heure");//Vieille Technique 
		System.out.print("      * Achet� le ");
		System.out.println(super.getDate());
		System.out.print("      * ");
		System.out.println(super.getAutonomie()+"km d'autonomie");
		}
	
	//toString
			@Override
			public String toString() {
				String resultat="Gyroroue";
				//Pas de pr�fixe pour l'instant
				resultat+=super.toString();
				
				//Pas de suffixe
				return resultat;
			}
	
}
