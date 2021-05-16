/**
 * 
 */
package ec.edu.ups.dao;

import ec.edu.ups.conn.JDBCDAOFactory;

/**
 * @author Gabriel Leonardo Chu
 *
 */
public abstract class DAOFactory {
	protected static DAOFactory factory = new JDBCDAOFactory();
	public static DAOFactory getFactory() {
		return factory;
	}
	public abstract void createTables();
	public abstract UsuarioDAO getUsuarioDAO();
	public abstract TelefonoDAO getTelefonoDAO();

}
