package test;

import bo.Adresse;

public class TestAdresse {
	public static void main(String[] args) {
		Adresse adresse1 = new Adresse(2, "bis", "rue", "Alfred Kastler", "44 306", "Nantes", "CEDEX 3");
		Adresse adresse2 = new Adresse(6, "boulevard", "General de Gaulle", "35 000", "Rennes");
		
		System.out.println("**********************");
		adresse1.afficher();
		System.out.println("**********************");
		adresse2.afficher();
		System.out.println("**********************");
	}
}
