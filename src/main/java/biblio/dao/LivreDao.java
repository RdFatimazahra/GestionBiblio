package biblio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import biblio.metier.Livre;

public class LivreDao implements InterfaceLivreDao {
	
	
	
	@Override
	public Livre save( Livre l) {
	
		Connection connection= SinglotonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("INSERT INTO produits(nom_produit,prix,quantite_en_stock,descript)VALUES(?,?,?,?)");
		    ps.setString(1, p.getNomProduit()); 
		    ps.setDouble(2, p.getPrix());
		    ps.setInt(3, p.getQuantite());
		    ps.setString(4, p.getDescription());
		    ps.executeUpdate();		    
		    PreparedStatement ps2=connection.prepareStatement("SELECT MAX(id) AS MAXID FROM produits");
		    ResultSet rs=ps2.executeQuery();	
		  if(rs.next()) {
			  p.setId(rs.getInt("MAXID"));
		  }
		    ps.close(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return p;
	}
	
	
	
	
	

}
