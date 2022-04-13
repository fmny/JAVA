package test;
import bo.*;

//Le répertoire bo contient les classes:
//Adresse, Creneau, Medecin_generaliste, Patient et RendezVous

import java.time.LocalDate;
import java.time.LocalTime;

/*
import bo.Adresse;
import bo.Creneau;
import bo.MedecinGeneraliste;*/

public class TestRendezVous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Adresse adresse1 = new Adresse(2, "bis", "rue", "Alfred Kastler", "44 306", "Nantes", "CEDEX 3");
		Adresse adresse2 = new Adresse(6, "boulevard", "General de Gaulle", "35 000", "Rennes");
		
		MedecinGeneraliste medecin1 = new MedecinGeneraliste("CASSIN", "Etienne", "0240121816",adresse1);
		MedecinGeneraliste medecin2 = new MedecinGeneraliste("CANTO", "Thomas", "0658121719",adresse2);

		Creneau cre1 = new Creneau(LocalTime.of(10, 0), 20, medecin1);
		Creneau cre2 = new Creneau(LocalTime.of(10, 30), 20, medecin2);

		
		Patient patient1 = new Patient("McFly", "Marty", "0212345678", 'M', 123456789l, LocalDate.of(1965, 06, 30), "Le patient est persuade de pouvoir voyager dans le temps avec une Dolorean",adresse1);
		
	
		RendezVous rv1=new RendezVous(cre1,patient1,LocalDate.of(2022,4,13));
		RendezVous rv2=new RendezVous(cre2,patient1,LocalDate.of(2022,4,20));
		
		
		System.out.println("-------------------------------------");
		System.out.println("Affichage du rendez-vous n°1");
		rv1.afficher();
		System.out.println("-------------------------------------");
		System.out.println("Affichage du rendez-vous n°2");
		rv2.afficher();
		
	}

}
