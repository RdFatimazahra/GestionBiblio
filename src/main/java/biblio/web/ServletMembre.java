	package biblio.web;
	
	import java.io.IOException;
	import java.sql.SQLException;
	import java.util.List;
	
	import biblio.dao.InterfaceMembres;
	import biblio.dao.MembreDAO;
	import biblio.metier.Membre;
	import jakarta.servlet.ServletException;
	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;
	
	public class ServletMembre extends HttpServlet {
	    private static final long serialVersionUID = 1L;
	    private final InterfaceMembres membreDAO;
	
	    public ServletMembre() {
	        super();
	        membreDAO = new MembreDAO(null);
	    }
	
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        try {
	            List<Membre> membres = membreDAO.afficher();
	            request.setAttribute("membres", membres);
	            request.getRequestDispatcher("/membres.jsp").forward(request, response);
	        } catch (SQLException e) {
	            e.printStackTrace();
	            response.sendRedirect("");
	        }
	    }
	
	
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        doGet(request, response);
	    }
	}
