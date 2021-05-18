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

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;


/**
 * @author Gabriel Leonardo Chu
 *
 */

@WebServlet("/agregar")
public class AnadirTelefono extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	private TelefonoDAO telefonoDao;
	private Telefono telefono;
	private UsuarioDAO usuarioDao;
	private Usuario usuario;
	
	/**
     * @see HttpServlet#HttpServlet()
     */
    public AnadirTelefono() {
    	telefonoDao = DAOFactory.getFactory().getTelefonoDAO();
		telefono = new Telefono();
		usuarioDao = DAOFactory.getFactory().getUsuarioDAO();
		usuario = new Usuario();
    }
    
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = null;
		//HttpSession session = request.getSession();
		try {
			telefono.setNumero(request.getParameter("numero"));
			telefono.setTipo(request.getParameter("tipo"));
			telefono.setOperadora(request.getParameter("operadora"));
			
			String cedu = request.getParameter("cedula");
			System.out.println("Valor de ced > "+cedu);
			usuario = usuarioDao.read(cedu);
			System.out.println("VALOR DESDE EL CREAR TELEFONO > "+usuario.toString());
			telefono.setUsuario(usuario);
			
			telefonoDao.create(telefono);

			System.out.println("Registro: " + telefono.toString() + ",");
			//session.setAttribute("succMsg", "Telefono Guardado");
			url = "/anadirTelefono.jsp";

		} catch (Exception e) {
			//session.setAttribute("failMsg", "Error al Guardar");
			url = "/anadirTelefono.jsp";
		}

		getServletContext().getRequestDispatcher(url).forward(request, response);
		
	}

}
