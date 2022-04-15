package bo;

import java.time.LocalDate;

public abstract class Gyro extends Cycle {
	private int autonomie;


	public Gyro() {
		super();
	}

	
	public Gyro(String marque, String modele, LocalDate date,int autonomie) {
		super(marque, modele, date);
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
		//super.afficher();
		//System.out.println(autonomie+"km d'autonomie");
	}
	//Faire toString
	
	
}
