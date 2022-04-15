package test;
//mon fichier test est en fait ma class Magasin


import bo.Velo;
//import bo.Gyro;
import bo.Gyropode;
import bo.Gyroroue;

import java.time.LocalDate;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Velo velo1 = new Velo ("Lapierre","Speed Run",LocalDate.of(2022, 03, 25),27);
		Velo velo2 = new Velo ("Btwin","Riverside",LocalDate.of(2022, 04, 10),10);
		
		
		System.out.println("------------------------");
		System.out.println("Afficher velo 1");
		System.out.println("------------------------");
		velo1.afficher();
		System.out.println("------------------------");
		System.out.println("Afficher velo 2");
		System.out.println("------------------------");
		velo2.afficher();
		
		Gyropode gyropode1=new Gyropode("Segway","Ninebot Elite",
				LocalDate.of(2022, 04, 13),40,"1m50");
		
		
		System.out.println("------------------------");
		System.out.println("Affichage Gyropode 1");
		gyropode1.afficher();
		
		
		Gyroroue gyroroue1=new Gyroroue("Immotion","V8",
				LocalDate.of(2022, 03, 12),40);
		
		Gyroroue gyroroue2=new Gyroroue("Segway","Ninebot One E+",
				LocalDate.of(2020, 04, 12),30);
		
		System.out.println("------------------------");
		System.out.println("Affichage Gyroroue 1");
		gyroroue1.afficher();
		
		System.out.println("------------------------");
		System.out.println("Affichage Gyroroue 2");
		gyroroue2.afficher();
		
		/*Compréhension de static
		//Test modif prix:
		Velo velo3 = new Velo ("Btwin","Riverside",LocalDate.of(2022, 04, 10),10,1000);
		velo3.afficher();
		
		//VErif que le tarif a changé pour tous les vélos
		System.out.println("-----------velo 2 100€?-------------");
		velo2.afficher();
		*/
	}

}
