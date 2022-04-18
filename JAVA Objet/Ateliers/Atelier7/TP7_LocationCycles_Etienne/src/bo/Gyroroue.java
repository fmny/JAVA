package bo;

import java.time.LocalDate;

public class Gyroroue extends Gyro {
	private static double tarif = 18.90;

	public Gyroroue(String marque, String modele, LocalDate dateAchat, int autonomie) {
		super(marque, modele, dateAchat, autonomie);
	}
	
	@Override
	public String toString() {
		String resultat = "";
		// Je prefixe par gyroroue
		resultat += "Gyroroue ";
		
		resultat += super.toString();
		
		// Pas de suffixe
		return resultat;
	}
	
	@Override
	public double getTarif() {
		return tarif;
	}
}
