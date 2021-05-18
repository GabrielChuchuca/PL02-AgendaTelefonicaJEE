/**
 * 
 */
package ec.edu.ups.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.modelo.Usuario;

/**
 * @author Gabriel Leonardo Chu
 *
 */

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Usuario usuario;
	private UsuarioDAO usuarioDAO;
	
	/**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
    	usuarioDAO = DAOFactory.getFactory().getUsuarioDAO();
		usuario = new Usuario();
        // TODO Auto-generated constructor stub
    }
    
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String correo = request.getParameter("correo");
		String contra = request.getParameter("contrasenia");
		
		usuario.setCorreo(correo);
		usuario.setContrasenia(contra);
		
		System.out.println("VALORES PASADOS DES >" + usuario.toString());
		
		Usuario u = usuarioDAO.loginUser(usuario);
		if(u != null) {
			HttpSession session = request.getSession(true);
			session.setAttribute("usuario", usuario.getNombre());
			session.setAttribute("cedula", usuario.getCedula());
			System.out.println("sesion TRUE");
			
			request.getSession(true).setAttribute("usuario", u.getNombre() + u.getApellido());
			request.getSession(true).setAttribute("cedula", u.getCedula());
			request.setAttribute("peticion", "Conectado..");

			
			RequestDispatcher rs = getServletContext().getRequestDispatcher("/pagina.jsp");
			rs.forward(request, response);
			
			//response.sendRedirect("index.jsp");
			//System.out.println("Usuario Correcto " + u);
		}else {
			HttpSession session = request.getSession(false);
			System.out.println("sesion FALSE");
			RequestDispatcher rs = getServletContext().getRequestDispatcher("/login.jsp");
			rs.forward(request, response);
			//response.sendRedirect("pagina.jsp");
			//System.out.println("Usuario o Contraseña Incorrecta " + u);
		}
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String correo = request.getParameter("correo");
		String contra = request.getParameter("contrasenia");
		
		usuario.setCorreo(correo);
		usuario.setContrasenia(contra);
		
		System.out.println("VALORES PASADOS DES >" + usuario.toString());
		
		Usuario u = usuarioDAO.loginUser(usuario);
		
		if(u.getCorreo() != null && u.getContrasenia() != null) {
			HttpSession session = request.getSession(true);
			session.setAttribute("usuario", u);
			//session.setAttribute("cedula", usuario.getCedula());
			System.out.println("sesion TRUE " + u);
			//response.sendRedirect("pagina.jsp");
			RequestDispatcher rs = getServletContext().getRequestDispatcher("/pagina.jsp");
			rs.forward(request, response);
			
			//response.sendRedirect("index.jsp");
			//System.out.println("Usuario Correcto " + u);
		}else {
			HttpSession session = request.getSession(false);
			System.out.println("sesion FALSE");
			RequestDispatcher rs = getServletContext().getRequestDispatcher("/login.jsp");
			rs.forward(request, response);
			//response.sendRedirect("pagina.jsp");
			//System.out.println("Usuario o Contraseña Incorrecta " + u);
		}
		
	}

}
