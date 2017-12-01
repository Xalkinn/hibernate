package bibliotheque;

public class Client {
	private int id;
	private String nom;
	private String prenom;
	private String livre_prefere;
	
	public Client(String nom, String prenom, String livre_prefere) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.livre_prefere = livre_prefere;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getLivre_prefere() {
		return livre_prefere;
	}
}
