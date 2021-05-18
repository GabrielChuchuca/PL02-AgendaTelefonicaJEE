/**
 * 
 */
package ec.edu.ups.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Gabriel Leonardo Chu
 *
 */
public class ConexionDB {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/agenda";
	private static final String USER = "root";
	private static final String PASS = "root";
	private static ConexionDB jdbc = null;
	//private static conexionBD jdbc2 = null;
	private Statement statement = null;
	
	public ConexionDB() {
		this.connect();
	}
	
	/**
	 * M�todo connect.
	 * 
	 * Realiza una conexi�n a la base de datos a trav�s de jdbc
	 */
	public void connect() {
		try {
			Class.forName(DRIVER);
			Connection connection = DriverManager.getConnection(URL, USER, PASS);
			this.statement = connection.createStatement();
		} catch (ClassNotFoundException e) {
			System.out.println(">>>WARNING (JDBC:connect)...problemas con el driver\n" + e.getMessage());
		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBC:connect)...problemas con la BD\n" + e.getMessage());
		}
	}
	
	/**
	 * M�todo query.
	 * 
	 * Realiza una sentencia SELECT a la base de datos.
	 */
	public ResultSet query(String sql) {
		try {
			return this.statement.executeQuery(sql);
		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBC:query): --- " + sql + " ---" + e);
		}
		return null;
	}
	
	/**
	 * M�todo update.
	 * 
	 * Realiza una sentencia INSERT, UDPDATE, DELETE, CREATE, entre otras a la base
	 * de datos.
	 */
	public boolean update(String sql) {
		try {
			this.statement.executeUpdate(sql);
			return true;
		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBC:update)... actualizacion: --- " + sql + " ---" + e);
			return false;
		}
	}
	
	/**
	 * M�todo getJDBC.
	 * 
	 * Obtiene una conexi�n activa a la base de datos
	 * 
	 * @return jdbc
	 */
	protected static ConexionDB getJDBC() {
		// creaci�n de la conexi�n a la base de datos solo si no ha sido creada patr�n
		// de dise�o singleton
		if (jdbc == null) {
			jdbc = new ConexionDB();
		}
		return jdbc;

	}

}
