/**
 * 
 */
package ec.edu.ups.dao;

import java.util.List;

/**
 * @author Gabriel Leonardo Chu
 *
 */
public interface GenericDAO<T, ID> {
	public void createTable();
	public void create(T entity);
	public T read(ID id);
	public T loginUser(T entity);
	public void update(T entity);
	public void delete(T entity);
	public List<T> find();

}
