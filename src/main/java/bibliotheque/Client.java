package bibliotheque;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
	private Livre livrePrefere;
	
	@ManyToMany
	private List<Livre> livreAchete = new ArrayList<Livre>();

	public Livre getLivrePrefere() {
		return livrePrefere;
	}

	public void setLivrePrefere(Livre livrePrefere) {
		this.livrePrefere = livrePrefere;
	}

	public List<Livre> getLivreAchete() {
		return livreAchete;
	}

	public void setLivreAchete(List<Livre> livreAchete) {
		this.livreAchete = livreAchete;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
		return livrePrefere;
	}

	public void setLivre_prefere(Livre livrePrefere) {
		this.livrePrefere = livrePrefere;
	}

	public Long getId() {
		return id;
	}	
}