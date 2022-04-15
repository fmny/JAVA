package bo;

import java.time.LocalDate;

public class Velo extends Cycle {
	private float tarif=4.9f;
	private int vitesse;
	
	
	public Velo() {}


	public Velo(String marque, String modele, LocalDate date, int vitesse) {
		super(marque, modele, date);
		this.vitesse = vitesse;
	}


	public float getTarif() {
		return tarif;
	}


	public void setTarif(float tarif) {
		this.tarif = tarif;
	}


	public int getVitesse() {
		return vitesse;
	}


	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}
	
	@Override
	public void afficher() {
		System.out.print("Vélo ");
		//super.afficher doit être en 1er
		super.afficher();
		System.out.print(":.....................");
		System.out.println("  " + tarif+"0€/heure");
		System.out.print("      * Acheté le ");
		System.out.println(super.getDate());
		System.out.print("      * ");
		System.out.println(vitesse+" vitesses");
		
		/*System.out.println("Tarif      : " + tarif+"€");
		System.out.println("Nombre de vitesses : " + vitesse);	
		System.out.print(":.....................");
		System.out.println("  " + tarif+"0€/heure");//Vieille Technique de Varcreux (voir E.Cassin)
		*/
		
		
		}
	
	
}
