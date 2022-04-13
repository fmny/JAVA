package bo;
import java.time.LocalTime;

public class Creneau {
	private LocalTime heureDebut;
	private int duree;
	private MedecinGeneraliste medecin;
	
	
	public Creneau(LocalTime heureDebut, int duree, MedecinGeneraliste medecin) {
		super();
		this.heureDebut = heureDebut;
		this.duree = duree;
		this.medecin = medecin;
	}

	public LocalTime getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(LocalTime heureDebut) {
		this.heureDebut = heureDebut;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public MedecinGeneraliste getMedecin() {
		return medecin;
	}

	public void setMedecin(MedecinGeneraliste medecin) {
		this.medecin = medecin;
	}
	
	
	public void afficher() {
		System.out.println("Heure de d�but       : " +
	this.heureDebut.getHour()+
	"h"+
	this.heureDebut.getMinute());
		
		//Autre m�thode:
		//System.out.println("Heure de d�but       : " +this.heureDebut.toString());
		System.out.println("Dur�e       : " + this.duree+ " minutes");
		System.out.println("Nom et Prenom du  m�decin : "+this.medecin.getNom()+" "+this.medecin.getPrenom());
	
		}

	
}
