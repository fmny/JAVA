package bo;

/*
 * J'ai honteusement copie colle la classe Adresse qu'on avait
 * avec les medecins :)
 */
public class Adresse {
	private int numero;
	private String complement;
	private String type;
	private String nomRue;
	private String codePostal;
	private String ville;
	private String mentionsComplementaires;
	
	public Adresse(int numero, String type, String nomRue, String codePostal, String ville) {
		this.numero = numero;
		// J'ai choisi de mettre des chaines vides par souci d'affichage par la suite
		// pour eviter d'afficher des "null"
		this.complement = "";
		this.type = type;
		this.nomRue = nomRue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.mentionsComplementaires = "";
	}

	public Adresse(int numero, String complement, String type, String nomRue, String codePostal, String ville,
			String mentionsComplementaires) {
		this.numero = numero;
		this.complement = complement;
		this.type = type;
		this.nomRue = nomRue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.mentionsComplementaires = mentionsComplementaires;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNomRue() {
		return nomRue;
	}

	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getMentionsComplementaires() {
		return mentionsComplementaires;
	}

	public void setMentionsComplementaires(String mentionsComplementaires) {
		this.mentionsComplementaires = mentionsComplementaires;
	}
	
	public void afficher() {
		System.out.println(
				numero + " " + complement
				+ ", "
				+ type
				+ " "
				+ nomRue
				+ ". "
				+ codePostal
				+ " "
				+ ville
				+ " "
				+ mentionsComplementaires);
	}
}
