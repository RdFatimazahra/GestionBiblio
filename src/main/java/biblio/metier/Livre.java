package biblio.metier;




public class Livre {
	
	private int IdLivre;
	private String titre;
	private String auteur;
	private String edition;
	private String datePub;
	
	
	public Livre() {
		super();
	}


	public Livre(String titre, String auteur, String edition, String datePub) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.edition = edition;
		this.datePub = datePub;
	}

	
	

	public int getIdLivre() {
		return IdLivre;
	}


	public void setIdLivre(int idLivre) {
		IdLivre = idLivre;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getAuteur() {
		return auteur;
	}


	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}


	public String getEdition() {
		return edition;
	}


	public void setEdition(String edition) {
		this.edition = edition;
	}


	public String getDatePub() {
		return datePub;
	}


	public void setDatePub(String datePub) {
		this.datePub = datePub;
	}


	@Override
	public String toString() {
		return "Livre [IdLivre=" + IdLivre + ", titre=" + titre + ", auteur=" + auteur + ", edition=" + edition
				+ ", datePub=" + datePub + "]";
	}
  
	
	
	

}
