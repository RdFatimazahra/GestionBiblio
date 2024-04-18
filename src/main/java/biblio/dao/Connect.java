package biblio.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

	private static Connection connection;
	
	static {
		String url="jdbc:postgresql://localhost:5432/GestionBiblio";
		String username="postgres";
		String password="admin";
		
		try {
			Class.forName("org.postgresql.Driver");
			
			connection =DriverManager.getConnection(url,username,password);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
	}
		
	
}
	
	public static Connection getConnection(){
	
		return connection;
	}
}
	

