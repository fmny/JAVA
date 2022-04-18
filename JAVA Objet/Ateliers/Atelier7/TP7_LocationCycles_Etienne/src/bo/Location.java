package bo;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Location {
	private LocalDateTime debut;
	private LocalDateTime fin;
	private Client locataire;
	private Cycle article;
	private boolean regle;
	
	public Location(Client locataire, Cycle article) {
		this.locataire = locataire;
		this.article = article;
		
		/*
		 * Valeurs par defaut :
		 *  on initialise la date et heure de debut a l'instant actuel (now)
		 *  on estime qu'une location qui vient d'etre creee n'est pas encore reglee
		 */
		this.debut = LocalDateTime.now();
		this.regle = false;
	}
	
	/*
	 * Constructeur par recopie :
	 * J'utilise les attributs d'une instance pour 
	 * en initialiser une nouvelle
	 */
	public Location(Location originale) {
		this(originale.getLocataire(), originale.getArticle());
	}
	
	public void terminerLocation() {
		fin = LocalDateTime.now();
	}
	
	public double calculerMontant() {
		/*
		 * On prevoit le scenario ou la date de fin n'est pas encore renseignee
		 * Dans ce cas, on affecte la date actuelle pour calculer le montant
		 */
		LocalDateTime dateDeFin;
		if (fin == null) dateDeFin = LocalDateTime.now();
		else dateDeFin = fin;
		
		long tempsDeLocation = ChronoUnit.HOURS.between(debut, dateDeFin);
		return tempsDeLocation * article.getTarif();
	}

	public LocalDateTime getDebut() {
		return debut;
	}

	public void setDebut(LocalDateTime debut) {
		this.debut = debut;
	}

	public LocalDateTime getFin() {
		return fin;
	}

	public void setFin(LocalDateTime fin) {
		this.fin = fin;
	}

	public Client getLocataire() {
		return locataire;
	}

	public void setLocataire(Client locataire) {
		this.locataire = locataire;
	}

	public Cycle getArticle() {
		return article;
	}

	public void setArticle(Cycle article) {
		this.article = article;
	}

	public boolean isRegle() {
		return regle;
	}

	public void setRegle(boolean regle) {
		this.regle = regle;
	}
}
