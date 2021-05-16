/**
 * 
 */
package ec.edu.ups.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Gabriel Leonardo Chu
 *
 */

@WebServlet("/salir")
public class SalirServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	/**
     * @see HttpServlet#HttpServlet()
     */
    public SalirServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();

		session.removeAttribute("user");
		
		HttpSession session2 = request.getSession();
		session2.setAttribute("logMsg", "Cierre Exitoso");
		
		response.sendRedirect("login.jsp");
	}


}
