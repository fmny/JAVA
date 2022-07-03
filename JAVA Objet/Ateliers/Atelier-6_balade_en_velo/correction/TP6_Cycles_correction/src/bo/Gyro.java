package bo;

import java.time.LocalDate;

public abstract class Gyro extends Cycle {
	protected int autonomie;
	
	public Gyro(String marque, String modele, LocalDate dateAchat, int autonomie) {
		super(marque, modele, dateAchat);
		this.autonomie = autonomie;
	}
	
	@Override
	public String toString() {
		String resultat = "";
		// Pas de prefixe pour l'instant
		resultat += super.toString();
		// Je commence par retourner à la ligne (\n)
		resultat += "\n *";
		resultat += autonomie;
		resultat += " kms d'autonomie";
		return resultat;
	}

	public int getAutonomie() {
		return autonomie;
	}

	public void setAutonomie(int autonomie) {
		this.autonomie = autonomie;
	}
}
