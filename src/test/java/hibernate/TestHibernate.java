package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import bibliotheque.Client;
import bibliotheque.Livre;
import dao.DatabaseHelper;

public class TestHibernate {

	public static void main(String[] args) {
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// Connexion avec la BDD
		EntityManager livre_1 = DatabaseHelper.createEntityManager();

		// On ouvre la connexion pour écrire dedans
		DatabaseHelper.beginTx(livre_1);

		// On crée un objet
		Livre l = new Livre();
		l.setAuteur("Georges Lucas");
		l.setTitre("Star Wars I : La menace fantome");

		// Il correspond au commit de git
		livre_1.persist(l);

		// Il correspond au push de git puis il ferme la connexion
		DatabaseHelper.commitTxAndClose(livre_1);

		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		EntityManager client_1 = DatabaseHelper.createEntityManager();
		client_1.getTransaction().begin();

		Client test = new Client();
		test.setNom("Tisserand");
		test.setPrenom("Julien");

		client_1.persist(test);
		DatabaseHelper.commitTxAndClose(client_1);

		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// UPLOAD

		EntityManager update_1 = DatabaseHelper.createEntityManager();
		update_1.getTransaction().begin();

		test.setNom("Tisserand");
		test.setPrenom("Juju");

		// Merge ici va me permettre d'upload
		update_1.merge(test);
		DatabaseHelper.commitTxAndClose(update_1);
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		EntityManager requette = DatabaseHelper.createEntityManager();
		requette.getTransaction().begin();
		
		//Livre car je recupere les livres pour un client
		TypedQuery<Livre> query = requette.createQuery(""
				+ "SELECT b"
				+ "FROM Livre b"
				+ "INNER JOIN b.acheteurs acheteur"
				+ "WHERE acheteur.id=:id",Livre.class);
		query.setParameter("id", test.getId());

	}
}