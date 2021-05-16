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

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.modelo.Usuario;

/**
 * @author Gabriel Leonardo Chu
 *
 */

@WebServlet("/registrar")
public class RegistrarseServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	private UsuarioDAO usuarioDao;
	private Usuario usuario;
	
	public RegistrarseServlet() {
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
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = null;
		try {
			usuario.setCedula(request.getParameter("cedula"));
			usuario.setNombre(request.getParameter("nombre"));
			usuario.setApellido(request.getParameter("apellido"));
			usuario.setCorreo(request.getParameter("correo"));
			usuario.setContrasenia(request.getParameter("contrasenia"));
			usuarioDao.create(usuario);
			System.out.println("Registro: " + usuario.getCedula() + " " + usuario.getNombre() + " " + 
					usuario.getApellido() + " " + usuario.getCorreo() + " " + usuario.getContrasenia());
			url = "/index.jsp";
		}catch (Exception e) {
			// TODO: handle exception
			url = "/Error.jsp";
		}
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

}
