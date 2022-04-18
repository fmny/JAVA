package bo;

import java.time.LocalDate;

public class Velo extends Cycle {
	private int nbVitesses;
	
	// Je peux mettre un met cle "final" qui implique
	// que le prix est constant / fige / ne changera pas
	private static /*final*/ double tarif = 4.90;
	
	public Velo(String marque, String modele, LocalDate dateAchat, int nbVitesses) {
		super(marque, modele, dateAchat);
		this.nbVitesses = nbVitesses;
	}

	public int getNbVitesses() {
		return nbVitesses;
	}

	public void setNbVitesses(int nbVitesses) {
		this.nbVitesses = nbVitesses;
	}

	@Override
	public double getTarif() {
		return tarif;
	}
	
	@Override
	public String toString() {
		String resultat = "";
		resultat += "Velo ";
		
		// Tout ce qui est avant mon super.toString()
		// est un prefixe
		
		// L'affiche de la marque, du modele, du prix
		// et de la date sont deja geres par Cycle
		resultat += super.toString();
		
		// Tout ce qui est apres mon super.toString()
		// est un suffixe
		
		// La methode super.toString() s'arrete apres
		// l'ecriture de la date, on commence donc
		// par un retour a la ligne (\n)
		resultat += "\n * ";
		resultat += nbVitesses;
		resultat += " vitesses";
		
		return resultat;
	}

	// Inutilises et vont m'embeter si je les laisse
	/*
	public static double getTarif() {
		return tarif;
	}

	public static void setTarif(double tarif) {
		Velo.tarif = tarif;
	}
	*/
}
