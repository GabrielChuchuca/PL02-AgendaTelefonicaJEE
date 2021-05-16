/**
 * 
 */
package ec.edu.ups.conn;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;

/**
 * @author Gabriel Leonardo Chu
 *
 */
public class JDBCUsuarioDAO extends JDBCGenericDAO<Usuario, Integer> implements UsuarioDAO{
	@Override
	public void createTable() {
		//jdbc.update("DROP TABLE IF EXISTS Usuario");
		jdbc.update("CREATE TABLE Usuario (CEDULA VARCHAR(10) NOT NULL, NOMBRE VARCHAR(75) NOT NULL, APELLIDO VARCHAR(75) NOT NULL, CORREO VARCHAR(75) NOT NULL, PRIMARY KEY (CEDULA))");
	}

	@Override
	public void create(Usuario usuario) {
		// TODO Auto-generated method stub
		jdbc.update("INSERT Usuario VALUES ('" + usuario.getCedula() + "', '" + usuario.getNombre() + "', '"
					+ usuario.getApellido() + "', '" + usuario.getCorreo() + "', '" + usuario.getContrasenia() + "')");
		
	}

	@Override
	public Usuario read(Integer cedula) {
		// TODO Auto-generated method stub
		Usuario usuario = null;
		ResultSet rs = jdbc.query("SELECT * FROM Usuario WHERE cedula = '" + cedula + "'");
		try {
			if(rs != null && rs.next()) {
				usuario = new Usuario(rs.getString("cedula"), rs.getString("nombre"), rs.getString("apellido"), rs.getString("correo"), rs.getString("contrasena"), null);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(">>>WARNING (JDBCCategoryDAO:read): " + e.getMessage());
		}
		return usuario;
	}
	
	@Override
	public Usuario loginUser(Usuario usuario) {
		List<Telefono> lista = new ArrayList<Telefono>();
		Usuario usu = null;
		ResultSet rs = jdbc.query("SELECT * FROM Usuario where correo = '" + usuario.getCorreo()
									+ "' and contrasenia = '" + usuario.getContrasenia() + "'");
		try {
			while(rs.next()) {
				usu = new Usuario();
				usu.setCedula(rs.getString("cedula"));
				usu.setNombre(rs.getString("nombre"));
				usu.setApellido(rs.getString("apellido"));
				usu.setCorreo(rs.getString("correo"));
				usu.setContrasenia(rs.getString("contrasenia"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return usu;
		
	}
	

	@Override
	public void update(Usuario usuario) {
		// TODO Auto-generated method stub
		//jdbc.update("UPDATE Usuario SET nombre = '" + usuario.getNombre() + "', apellido = '" + usuario.getApellido() + "', correo = '"
					//+ usuario.getCorreo() + "', contrasena = '" + usuario.getContrasenia()+ "' WHERE cedula = '" + usuario.getCedula() + "'");
		
	}

	@Override
	public void delete(Usuario usuario) {
		// TODO Auto-generated method stub
		//jdbc.update("DELETE FROM Usuario WHERE cedula = '" + usuario.getCedula() + "'");
	}

	
	 @Override
	 
	public List<Usuario> find() {
		// TODO Auto-generated method stub
		 /*List<Usuario> list = new ArrayList<Usuario>();
		ResultSet rs = jdbc.query("SELECT * FROM Usuario");
		try {
			while(rs.next()) {
				list.add(new Usuario(rs.getString("cedula"), rs.getString("nombre"), rs.getString("apellido"), rs.getString("correo"), rs.getString("contrasena")));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(">>>WARNING (JDBCCategoryDAO:find): " + e.getMessage());
		}*/
		return null;
	}
	

}
