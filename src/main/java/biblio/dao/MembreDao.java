package biblio.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import biblio.metier.Membre;

public class MembreDAO implements InterfaceMembres {
    private Connection connection;

    // Constructor with external connection
    public MembreDAO(Connection connection) {
        this.connection = connection;
    }

    // Implementing the InterfaceMembres methods
    @Override
    public void ajouter(Membre membre) {
        try {
            String query = "INSERT INTO membre (nom, prenom, address, telephone, email) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, membre.getNom());
            statement.setString(2, membre.getPrenom());
            statement.setString(3, membre.getAddress());
            statement.setString(4, membre.getTelephone());
            statement.setString(5, membre.getEmail());

            statement.executeUpdate();
            System.out.println("Membre ajouté avec succès.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erreur lors de l'ajout du membre : " + e.getMessage());
        }
    }

    @Override
    public List<Membre> afficher() {
        List<Membre> membres = new ArrayList<>();
        try {
            String query = "SELECT * FROM membre";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                Membre membre = new Membre();
                membre.setIdMembre(resultSet.getInt("idMembre"));
                membre.setNom(resultSet.getString("nom"));
                membre.setPrenom(resultSet.getString("prenom"));
                membre.setAddress(resultSet.getString("address"));
                membre.setTelephone(resultSet.getString("telephone"));
                membre.setEmail(resultSet.getString("email"));

                membres.add(membre);
            }
            System.out.println("Liste des membres récupérée avec succès.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erreur lors de la récupération des membres : " + e.getMessage());
        }
        return membres;
    }

    @Override
    public void supprimer(int idMembre) {
        try {
            String query = "DELETE FROM membre WHERE idMembre = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, idMembre);

            statement.executeUpdate();
            System.out.println("Membre supprimé avec succès.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erreur lors de la suppression du membre : " + e.getMessage());
        }
    }

    @Override
    public void modifier(Membre membre) {
        try {
            String query = "UPDATE membre SET nom = ?, prenom = ?, address = ?, telephone = ?, email = ? WHERE idMembre = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, membre.getNom());
            statement.setString(2, membre.getPrenom());
            statement.setString(3, membre.getAddress());
            statement.setString(4, membre.getTelephone());
            statement.setString(5, membre.getEmail());
            statement.setInt(6, membre.getIdMembre());

            statement.executeUpdate();
            System.out.println("Membre modifié avec succès.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erreur lors de la modification du membre : " + e.getMessage());
        }
    }
}
