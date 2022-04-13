package test;

import java.time.LocalDate;

import bo.Adresse;
import bo.Patient;

public class TestPatient {
	public static void main(String[] args) {
		Adresse adresse1 = new Adresse(2, "bis", "rue", "Alfred Kastler", "44 306", "Nantes", "CEDEX 3");
		Adresse adresse2 = new Adresse(6, "boulevard", "General de Gaulle", "35 000", "Rennes");
		
		
		Patient patient1 = new Patient("McFly", "Marty", "0212345678", 'M', 123456789l, LocalDate.of(1965, 06, 30), "Le patient est persuade de pouvoir voyager dans le temps avec une Dolorean",adresse1);
		Patient patient2 = new Patient();
		patient2.setNom("Parker");
		patient2.setPrenom("Jennifer");
		patient2.setTelephone("0298765432");
		patient2.setSexe('F');
		patient2.setNumeroSecu(287654321);
		patient2.setDateDeNaissance(LocalDate.of(1965, 12, 3));
		patient2.setCommentaires("La patiente semble souffrir d'un syndrome de Stockholm vis-a-vis de M.McFly");
		patient2.setAdresse(adresse2);
		
		System.out.println("*************************");
		patient1.afficher();
		System.out.println("*************************");
		patient2.afficher();
		
		patient2.setNom("McFly");
		// Astuce pour ajouter a la suite du commentaire precedent
		// Au lieu d'ecraser le commentaire existant (utilisation du get concatener au nouveau commentaire)
		patient2.setCommentaires(patient2.getCommentaires() + "; La patiente est desormais mariee a M.McFly. A surveiller.");
		System.out.println("*************************");
		patient2.afficher();
	}
}