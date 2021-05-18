/**
 * 
 */
package ec.edu.ups.conn;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.dao.UsuarioDAO;

/**
 * @author Gabriel Leonardo Chu
 *
 */
public class JDBCDAOFactory extends DAOFactory {
	@Override
	public void createTables() {
		//this.getUsuarioDAO().createTable();
		//this.getTelefonoDAO().createTable();
	}
	
	@Override
	public UsuarioDAO getUsuarioDAO() {
		return new JDBCUsuarioDAO();
	}

	@Override
	public TelefonoDAO getTelefonoDAO() {
		// TODO Auto-generated method stub
		return new JDBCTelefonoDAO();
		//return null;
	
	}

}
