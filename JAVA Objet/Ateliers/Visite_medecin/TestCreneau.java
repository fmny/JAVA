package test;

import java.time.LocalTime;

import bo.Adresse;
import bo.Creneau;
import bo.MedecinGeneraliste;

public class TestCreneau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adresse adresse1 = new Adresse(2, "bis", "rue", "Alfred Kastler", "44 306", "Nantes", "CEDEX 3");
		MedecinGeneraliste medecin1 = new MedecinGeneraliste("CASSIN", "Etienne", "0240121816",adresse1);
		
		LocalTime temps=LocalTime.of(15,30);
		//Test de l'affichage de LocalTime
		System.out.println(LocalTime.of(15,30));
		
		
		Creneau creneau1= new Creneau(temps, 15, medecin1);
		
		System.out.println("Affichage de créneau");
		creneau1.afficher();
		
		
		
	}

}
