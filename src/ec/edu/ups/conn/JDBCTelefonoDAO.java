/**
 * 
 */
package ec.edu.ups.conn;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;

/**
 * @author Gabriel Leonardo Chu
 *
 */
public class JDBCTelefonoDAO extends JDBCGenericDAO<Telefono, Integer> implements TelefonoDAO {

	@Override
	public void createTable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Telefono telefono) {
		ResultSet rs = jdbc.query("select * from Telefono order by codigo desc limit 1;");
		try {
			int codigo = 0;
			while(rs.next())
				codigo = (rs.getInt("codigo") + 1);
				System.out.println("puta madre" + codigo);
				jdbc.update("INSERT Telefono VALUES ("+ codigo +", '" + telefono.getNumero() + "', '" + telefono.getTipo() + "', '"
					+ telefono.getOperadora() + "', '" + telefono.getUsuario().getCedula() + "')");
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		

	}

	@Override
	public Telefono read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Telefono loginUser(Telefono entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Telefono entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Telefono entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Telefono> find() {
		// TODO Auto-generated method stub
		return null;
	}

}
