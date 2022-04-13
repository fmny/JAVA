package Eleve_groupe;

import java.util.Iterator;

public class Groupe {
	private String nom;
	private Eleve[] tableauEleves;
	//private int index=0;

	
	//Getter et Setter
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Eleve[] getTableauEleves() {
		return tableauEleves;
	}

	public void setTableauEleves(Eleve[] tableauEleves) {
		this.tableauEleves = tableauEleves;
	}
	//Fin Getter et Setter
	
	
	public Groupe() {}
	
	/*public Groupe(String nom) {
		this.nom=nom;
	}*/
	
	public Groupe(String nom, int nbEleves) {
		this.nom=nom;
		tableauEleves=new Eleve[nbEleves];
	}


	
	
	public void ajouterEleve(Eleve eleveAAjouter)
	{
		int cpt=0;
		boolean insere=false;
		//Tant que je suis dans les limites du tableau et que 
		//l'element n'a pas encore ete insere je boucle
		while (cpt<tableauEleves.length && insere==false)
			//Une case null est une case vide, je peux procéder a l'insertion
		{
			if (tableauEleves[cpt] == null) {
				
				//Au moment ou on  affecte l'eleve au groupe
				tableauEleves[cpt]=eleveAAjouter;
				
				//on en profite pour affecter egalement ce groupe (this)
				//a l'eleve en question
				//this designe l'instance de groupe en cours
				tableauEleves[cpt].setGroupe(this);
				
				//Equivalent a:
				//eleveAAjouter.setGroupe(this);
				insere=true;
			}
			cpt++;	
		}
		if (!insere ) {
			System.err.println("Impossible d'inserer un nouvel eleve");
		}
		
	}
	
	
	public void retirerEleve(Eleve eleveARetirer) {
		int cpt=0;
		boolean supprime=false;
		
		//Tant que je suis dans les limites du tableau et que 
		//l'element n'a pas encore ete supprime je boucle
		while (cpt<tableauEleves.length && !supprime)
			//D'une part la case est non null (je ne supprime pas qqchose d'inexistant 
			//(sinon erreur: null pointer exception
			//D'autre part, le nom de l'eleve a supprimer correspond au nom de l'eleve actuel
			//Enfin, le prenom de l'eleve a supprimer correspond au prenom de l'eleve actuel
		{
			
			
			//Java utilise la "lazy interpretation" -> si la 1ere condition est fausse
			//Il n'execute pas les suivantes (conclusion : on teste le non null en premier)
			//On appelle ca "null-safe"
			if (tableauEleves[cpt] != null 
					&& tableauEleves[cpt].getNom().equals(eleveARetirer.getNom())
					&& tableauEleves[cpt].getPrenom().equals(eleveARetirer.getPrenom())) {
				
				//Au moment ou on  supprime l'eleve au groupe
				tableauEleves[cpt]=null;
				
				supprime=true;
				
			}
			cpt++;
		}
		if (!supprime) {
			System.err.println("Cet eleve n'existe pas");
		}
		
	}
	
	public void envoyerMail()
	{
		for (Eleve current :tableauEleves) {
			if (current!= null) {
			System.out.println(current.getPrenom()+" a bien recu le mail");
			}
		}
	}
		
	
	
}
