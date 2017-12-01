package bibliotheque;

public class Livre {
	private String titre;
	private String auteur;
	private int id;
	
	public Livre(String auteur, int id) {
		this.auteur = auteur;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public String getAuteur() {
		return auteur;
	}
	
	

}
