package test;

import java.time.LocalTime;

import bo.Adresse;
import bo.Creneau;
import bo.MedecinGeneraliste;

public class TestMedecinGeneraliste {
	public static void main(String[] args) {
		//MedecinGeneraliste medecin1 = new MedecinGeneraliste("CASSIN", "Etienne", "0240121816");
		//MedecinGeneraliste medecin2 = new MedecinGeneraliste("CANTO", "Thomas", "0658121719");
		
		
		Adresse adresse1 = new Adresse(2, "bis", "rue", "Alfred Kastler", "44 306", "Nantes", "CEDEX 3");
		Adresse adresse2 = new Adresse(6, "boulevard", "General de Gaulle", "35 000", "Rennes");
		
		//Ajout Atelier 4
		MedecinGeneraliste medecin1 = new MedecinGeneraliste("CASSIN", "Etienne", "0240121816",adresse1);
		MedecinGeneraliste medecin2 = new MedecinGeneraliste("CANTO", "Thomas", "0658121719",adresse2);
		
		System.out.println("****************");
		medecin1.afficher();
		
		Creneau cre1 = new Creneau(LocalTime.of(10, 0), 20, medecin1);
		Creneau cre2 = new Creneau(LocalTime.of(10, 30), 20, medecin1);
		
		System.out.println("****************");
		medecin1.ajouterCreneau(cre1);
		medecin1.ajouterCreneau(cre2);
		
		
		System.out.println("****************");
		medecin1.afficher();
		System.out.println("****************");
		medecin2.afficher();
		System.out.println("****************");
		/*
		System.out.println("****************");
		medecin1.afficher();
		System.out.println("****************");
		medecin2.afficher();
		System.out.println("****************");
		System.out.println("Modification du médecin Thomas");
		medecin2.setNom("MEZIER");
		medecin2.setTelephone("(+33)658121719");
		System.out.println("****************");
		medecin2.afficher();
		
		System.out.println("****************");
		System.out.println("Modification du tarif");
		MedecinGeneraliste.setTarif(27);
		System.out.println("****************");
		medecin1.afficher();
		System.out.println("****************");
		medecin2.afficher();
		System.out.println("FIN DU TEST");
		*/
	}
}
