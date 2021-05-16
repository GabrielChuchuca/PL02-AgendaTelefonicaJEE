/**
 * 
 */
package ec.edu.ups.conn;

import ec.edu.ups.dao.GenericDAO;

/**
 * @author Gabriel Leonardo Chu
 *
 */
public abstract class JDBCGenericDAO<T, ID> implements GenericDAO<T, ID> {
	protected ConexionDB jdbc = ConexionDB.getJDBC();
}
