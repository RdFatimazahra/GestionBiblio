package biblio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import biblio.metier.Livre;

public class LivreDao implements InterfaceLivreDao {
    
	
	//Fonction ajouter livre ::
    @Override
    public Livre save(Livre livre) {
        Connection con = Connect.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            String query = "INSERT INTO books(title, writer, edition, pubDate) VALUES (?, ?, ?, ?)";
            ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, livre.getTitre());
            ps.setString(2, livre.getAuteur());
            ps.setString(3, livre.getEdition());
            ps.setString(4, livre.getDatePub());
            
            int rowsAffected = ps.executeUpdate();
            
            if (rowsAffected > 0) {
                rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    livre.setIdLivre(rs.getInt(1));
                }
            }
        } catch (SQLException e) {
            System.err.println("Erreur lors de l'insertion du livre : " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                System.err.println("Erreur lors de la fermeture des ressources JDBC : " + e.getMessage());
            }
        }
        
        return livre;
    }
    
    
   //Fonction Afficher tous les livres
    
    public List<Livre> getTousLivres() {
        List<Livre> livres = new ArrayList<>();
        Connection con = Connect.getConnection();
        
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM books");
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Livre livre = new Livre();
                livre.setIdLivre(rs.getInt("idbook"));
                livre.setTitre(rs.getString("title"));
                livre.setAuteur(rs.getString("writer"));
                livre.setEdition(rs.getString("edition"));
                livre.setDatePub(rs.getString("pubDate"));
                livres.add(livre);
            }
            
            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // Gérer l'erreur de base de données
        }
        
        return livres;
    }


//Fonction  Supprimer livre
    
 @Override
public void deleteLivre(int id) {
	
	Connection con= Connect.getConnection();
	try {
		PreparedStatement ps=con.prepareStatement("DELETE FROM books WHERE idbook=?");
	    ps.setInt(1, id); 
	    ps.executeUpdate();
	    ps.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	
}}
