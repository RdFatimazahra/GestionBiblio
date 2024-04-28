package biblio.dao;

import biblio.metier.Membre;
import java.sql.Connection;

public class TestMembre {

    public static void main(String[] args) {
        Connect.connectToDatabase(); // Connect to the database

        Connection connection = Connect.getConnection();
        if (connection != null) {
            // Perform additional actions when connection is successful
            System.out.println("Connected to the database.");
            MembreDAO membreDAO = new MembreDAO(connection);
            Membre membre = new Membre();
            membre.setNom("fhhgghh");
            membre.setPrenom("Doe");
            membre.setAddress("123 Street");
            membre.setTelephone("1234567890");
            membre.setEmail("john.doe@example.com");
            membreDAO.ajouter(membre);
        } else {	
            System.out.println("Failed to connect to the database.");
        }
    }
}
