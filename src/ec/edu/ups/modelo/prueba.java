/**
 * 
 */
package ec.edu.ups.modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Gabriel Leonardo Chu
 *
 */
public class prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", "root", "root");
			System.out.println("Hola desde la Base" );
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
