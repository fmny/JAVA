package Eleve_groupe;
//package cour4.atelier4

public class TestGroupEleve {

	public static void main(String[] args) {
		
		//créer groupe
		//Créer élève
		//ajouter eleve dasn groupe
		
		
		Groupe groupe=new Groupe("coordonees",4);
		
		Eleve eleve1=new Eleve("a1","b1");
		Eleve eleve2=new Eleve("a2","b2");
		
		
		groupe.ajouterEleve(eleve1);
		groupe.ajouterEleve(eleve2);
		
		groupe.envoyerMail();
		
		System.out.println(eleve2.getGroupe().getNom());
		
		for (Eleve current : groupe.getTableauEleves()) {
			/*reprendre ici*/
		}

	}

}
