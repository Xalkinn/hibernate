package bibliotheque;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "livre")
public class Livre {

	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String titre;

	@Column
	private String auteur;
	
	@ManyToMany(mappedBy = "livreAchete")
	private List<Client> acheteurs = new ArrayList<Client>();

	public List<Client> getAcheteurs() {
		return acheteurs;
	}

	public void setAcheteurs(List<Client> acheteurs) {
		this.acheteurs = acheteurs;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Long getId() {
		return id;
	}

}
