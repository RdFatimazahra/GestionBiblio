package biblio.dao;

import java.sql.Connection;
import java.util.Date;
import java.util.List;

import biblio.metier.Livre;

public class Test {
  
		    public static void main(String[] args) {
		    	Connection con=Connect.getConnection();

		        LivreDao livreDao = new LivreDao();
		        
		        // Exécution de la méthode getTousLivres()
		        List<Livre> livres = livreDao.getTousLivres();
		        
		        // Vérification si des livres ont été récupérés
		        if (!livres.isEmpty()) {
		            // Affichage des livres récupérés
		            System.out.println("Livres récupérés depuis la base de données :");
		            for (Livre livre : livres) {
		                System.out.println(livre);
		            }
		        } else {
		            System.out.println("Aucun livre récupéré depuis la base de données.");
		        }
		    }
		



//
//LivreDao livreDao = new LivreDao();
//
//// Création d'un objet Livre avec des données fictives
//Livre livre = new Livre();
//livre.setTitre("Titre du livre");
//livre.setAuteur("Auteur du livre");
//livre.setEdition("Édition du livre");
//livre.setDatePub(new Date()); // Date actuelle
//
//// Appel de la méthode save() pour ajouter le livre à la base de données
//Livre livreAjoute = livreDao.save(livre);
//
//// Vérification si l'ajout a réussi
//if (livreAjoute.getIdLivre() != 0) {
//    System.out.println("Livre ajouté avec succès. ID du livre ajouté : " + livreAjoute.getIdLivre());
//} else {
//    System.out.println("Échec de l'ajout du livre.");
//}
}
	
	
	

	


