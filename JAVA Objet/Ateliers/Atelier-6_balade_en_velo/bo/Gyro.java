package bo;

import java.time.LocalDate;

public abstract class Gyro extends Cycle {
	private int autonomie;


	public Gyro() {
		super();
	}

	
	public Gyro(String marque, String modele, LocalDate dateAchat,int autonomie) {
		super(marque, modele, dateAchat);
		this.autonomie = autonomie;
		// TODO Auto-generated constructor stub
	}


	public int getAutonomie() {
		return autonomie;
	}


	public void setAutonomie(int autonomie) {
		this.autonomie = autonomie;
	}
	
	@Override
	public void afficher()
	{
		super.afficher();
		//System.out.println(autonomie+"km d'autonomie");
	}
	
	//Faire toString
	
	//toString
		@Override
		public String toString() {
			String resultat="";
			//Pas de préfixe pour l'instant
			resultat+=super.toString();
			// Je commence par retourner à la ligne (\n)
			resultat += "\n *";
			resultat += autonomie;
			resultat += " kms d'autonomie";
			return resultat;
		}
	
}
