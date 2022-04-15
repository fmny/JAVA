package bo;

import java.time.LocalDate;

public class Velo extends Cycle {
	//Je peux mettre un mot cle final
	//Pour que le tarif soit figé dans la class:
	//private static final float tarif=4.9f;
	//Dans ce cas le setTarif() affiche une erreur dans Eclypse
	private static float tarif=4.9f;
	//private static double tarif=4.90;
	private int vitesse;
	
	public Velo() {}

	public Velo(String marque, String modele, LocalDate dateAchat, int vitesse) {
		super(marque, modele, dateAchat);
		this.vitesse = vitesse;
	}

	/*pour comprendre static tarif
	public Velo(String marque, String modele, LocalDate dateAchat, int vitesse,float tarif) {
		super(marque, modele, dateAchat);
		this.vitesse = vitesse;
		this.tarif=tarif;
	}
	*/
	
	public float getTarif() {
		return tarif;
	}


	public void setTarif(float tarif) {
		this.tarif = tarif;
	}


	public int getVitesse() {
		return vitesse;
	}


	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}
	
	@Override
	public void afficher() {
		System.out.print("Vélo ");
		//super.afficher doit être en 1er
		super.afficher();
		System.out.print(":..................");
		System.out.println("  " + tarif+"0€/heure");
		System.out.print("      * Acheté le ");
		System.out.println(super.getDate());
		System.out.print("      * ");
		System.out.println(vitesse+" vitesses");
		
		/*System.out.println("Tarif      : " + tarif+"€");
		System.out.println("Nombre de vitesses : " + vitesse);	
		System.out.print(":.....................");
		System.out.println("  " + tarif+"0€/heure");//Vieille Technique de Varcreux (voir E.Cassin)
		*/
		
		
		}
	
	//toString
	@Override
	public String toString() {
		String resultat="";
		resultat+="Vélo ";
		
		//Tout ce qui est avant mon super.toString() est un prefixe
		
		//L'affichage de la marque, du modele, du prix, et de la date
		//sont deja gere par Cycle
		resultat+=super.toString();
		
		// Tout ce qui est apres mon super.toString()
				// est un suffixe
				
				// La methode super.toString() s'arrete apres
				// l'ecriture de la date, on commence donc
				// par un retour a la ligne (\n)
				resultat += "\n *";
				resultat += vitesse;
				resultat += " vitesses ";
		return resultat;
	}
	
	//---------------------------------------------------------
	/*Méthode Quentin pour compter le nombre de "." à mettre:
	 * @Override
    public String toString() {
        int longueurLigne = 50;
        int nbPoints = longueurLigne - marque.length() - modele.length();
        String points = "";
        for (int i = 0; i < nbPoints; i++) {
            points += ".";
        }
        return ("-    " + marque + " " + modele + " :" + points);
    }
	 */
	//-----------------------------------------------------------
	
}