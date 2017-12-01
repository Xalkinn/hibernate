package bibliotheque;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client {

	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String nom;

	@Column
	private String prenom;

	@ManyToOne
	private Livre livre_prefere;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Livre getLivre_prefere() {
		return livre_prefere;
	}

	public void setLivre_prefere(Livre livre_prefere) {
		this.livre_prefere = livre_prefere;
	}

	public Long getId() {
		return id;
	}	
}