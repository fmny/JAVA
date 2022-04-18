package test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import bo.Adresse;
import bo.Client;
import bo.Cycle;
import bo.Gyropod;
import bo.Gyroroue;
import bo.Location;
import bo.Magasin;
import bo.Velo;

public class TestCycle {
	public static void main(String[] args) {
		Magasin monMagasin = new Magasin();
		
		Cycle cycle1 = new Velo("Lapierre", "Speed Run 400", LocalDate.of(2021, 03, 25), 27);
		Cycle cycle2 = new Velo("Btwin", "Riverside 900", LocalDate.of(2022, 04, 10), 10);
		Cycle cycle3 = new Gyropod("Segway", "Ninebot elite", LocalDate.of(2022, 03, 12), 40, 150);
		Cycle cycle4 = new Gyropod("Weebot", "echo", LocalDate.of(2022, 03, 12), 35, 160);
		Cycle cycle5 = new Gyroroue("Immotion", "v8", LocalDate.of(2022, 03, 12), 40);
		Cycle cycle6 = new Gyroroue("Segway", "Ninebot One E+", LocalDate.of(2020, 12, 04), 30);
		
		Adresse adresse1 = new Adresse(2, "bis", "rue", "Alfred Kastler", "44 306", "Nantes", "CEDEX 3");
		Adresse adresse2 = new Adresse(6, "boulevard", "General de Gaulle", "35 000", "Rennes");
		
		Client client1 = new Client("FRANCOIS", "Claude", adresse1);
		Client client2 = new Client("JACKSON", "Michael", adresse2);
		
		monMagasin.ajouterArticle(cycle1);
		monMagasin.ajouterArticle(cycle2);
		monMagasin.ajouterArticle(cycle3);
		monMagasin.ajouterArticle(cycle4);
		monMagasin.ajouterArticle(cycle5);
		monMagasin.ajouterArticle(cycle6);
		
		monMagasin.ajouterClient(client1);
		monMagasin.ajouterClient(client2);
		
		// J'ajouter systematiquement l'information dans les deux sens :
		// Quand j'affecte une location a un client
		// J'affecte le client a cette location 
		// (Association bidirectionnelle)
		Location loc1 = new Location(client2, cycle1);
		client2.ajouterLocation(loc1);
		
		Location loc2 = new Location(client2, cycle4);
		client2.ajouterLocation(loc2);
		
		Location loc3 = new Location(client2, cycle5);
		client2.ajouterLocation(loc3);
		
		Location loc4 = new Location(client2, cycle2);
		client2.ajouterLocation(loc4);
		
		Location loc5 = new Location(client1, cycle6);
		client1.ajouterLocation(loc5);
		
		
		monMagasin.ajouterLocation(loc1);
		monMagasin.ajouterLocation(loc2);
		monMagasin.ajouterLocation(loc3);
		monMagasin.ajouterLocation(loc4);
		monMagasin.ajouterLocation(loc5);
		
		System.out.println(monMagasin.toString());
		
		/*
		 * Fermez les yeux, je truque mes locations pour qu'elles ne soit plus a la date du jour
		 */
		loc1.setDebut(LocalDateTime.of(2022, 04, 14, 15, 0));
		loc2.setDebut(LocalDateTime.of(2022, 04, 15, 0, 45));
		loc3.setDebut(LocalDateTime.of(2022, 04, 10, 21, 30));
		loc4.setDebut(LocalDateTime.of(2022, 04, 12, 21, 10));
		Location loc6 = new Location(loc1);
		
		monMagasin.ajouterLocation(loc6);
		
		System.out.println("Montant de factures pour le client 2");
		System.out.println(monMagasin.calculerMontant(client2) + " e");
	}
}
