package biblio.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import biblio.dao.LivreDao;


public class ServletLivre extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ServletLivre() {
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String path=request.getServletPath();
		if(path.equals("/livres.java")) {
			 request.getRequestDispatcher("jsp/BookJSP.jsp").forward(request, response); 
			 LivreDao dao=new LivreDao();
			Model model =dao.getTousLivres();
			
			 
		}
		
		
		else {
			response.sendError(response.SC_NOT_FOUND);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
