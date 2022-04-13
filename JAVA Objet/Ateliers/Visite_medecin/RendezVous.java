package bo;


import java.time.LocalDate;

//import java.util.Date; cette librairie est obsol�te
//Utiliser toujours LocalDate plut�t que Date

public class RendezVous {

	private Creneau creneau;
	private Patient patient;
	private LocalDate date;
	
	
	public RendezVous(Creneau creneau, Patient patient, LocalDate date) {
		super();
		this.creneau = creneau;
		this.patient = patient;
		this.date = date;
	}
	public Creneau getCreneau() {
		return creneau;
	}
	public void setCreneau(Creneau creneau) {
		this.creneau = creneau;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public void afficher() {
		/*Date, heure, dur�e et rendez-vous
		 * Nom du docteur
		 * D�tail du patient
		 * adresse du praticien
		 */
		System.out.println("Date : "+ date.toString());
		System.out.println("Heure : "+ creneau.getHeureDebut().toString());
		System.out.println("Duree : "+ creneau.getDuree());
		//Pas d'acces direct au DR, en revanche � un creneau 
		//est associ� un medecin
		System.out.println("Docteur : "+creneau.getMedecin().getNom());
		patient.afficher();
		//Je vais chercher l'adresse qui se trouve dans medecin
		//qui se trouve lui meme dans creneau
		//puis j'appelle la m�thode afficher()
		if (creneau.getMedecin().getAdresse() !=null)
			{creneau.getMedecin().getAdresse();}
	
	}
}
