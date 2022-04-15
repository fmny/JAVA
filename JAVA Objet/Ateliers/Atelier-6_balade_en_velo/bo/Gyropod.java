package bo;

import java.time.LocalDate;

public class Gyropod extends Gyro {
	private int tailleMinimum;
	private static double tarif = 29.90;

	public Gyropod(String marque, String modele, LocalDate dateAchat, int autonomie, int tailleMinimum) {
		super(marque, modele, dateAchat, autonomie);
		this.tailleMinimum = tailleMinimum;
	}
	
	@Override
	public String toString() {
		String resultat = "";
		// Je prefixe par gyropode
		resultat += "Gyropode ";
		
		// "super" designe la classe directement au dessus
		// dans l'heritage. Donc Gyro ici
		// Et le toString de Gyro appelle celui de Cycle
		/*
		 * Donc dans l'ordre : 
		 *     le toString de Gyropod se base sur 
		 *     le toString de Gyro qui lui meme se base sur
		 *     le toString de Cycle
		 * Si toString n'existe pas dans Gyro, il va chercher celui de Cycle
		 * Si il n'existe pas non plus dans Cycle, il prend celui de Object
		 */
		resultat += super.toString();
		
		// Suffixe : taille minimum pour le gyropode
		resultat += "\n * ";
		resultat += "Taille minimum : ";
		resultat += tailleMinimum;
		resultat += " cm";
		return resultat;
	}
	
	@Override
	public double getTarif() {
		return tarif;
	}

	public int getTailleMinimum() {
		return tailleMinimum;
	}

	public void setTailleMinimum(int tailleMinimum) {
		this.tailleMinimum = tailleMinimum;
	}
}
