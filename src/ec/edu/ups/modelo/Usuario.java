/**
 * 
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.List;

/**
 * @author Gabriel Leonardo Chu
 *
 */
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String cedula;
	private String nombre;
	private String apellido;
	private String correo;
	private String contrasenia;
	private List<Telefono> listaTelefono;
	
	public Usuario() {
		//super();
	}

	/**
	 * @param cedula
	 * @param nombre
	 * @param apellido
	 * @param correo
	 * @param contrasenia
	 * @param listaTelefono
	 */
	public Usuario(String cedula, String nombre, String apellido, String correo, String contrasenia,
			List<Telefono> listaTelefono) {
		//super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.contrasenia = contrasenia;
		this.listaTelefono = listaTelefono;
	}

	/**
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}

	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * @return the contrasenia
	 */
	public String getContrasenia() {
		return contrasenia;
	}

	/**
	 * @param contrasenia the contrasenia to set
	 */
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	/**
	 * @return the listaTelefono
	 */
	public List<Telefono> getListaTelefono() {
		return listaTelefono;
	}

	/**
	 * @param listaTelefono the listaTelefono to set
	 */
	public void setListaTelefono(List<Telefono> listaTelefono) {
		this.listaTelefono = listaTelefono;
	}

	@Override
	public String toString() {
		return "Usuario [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo
				+ ", contrasenia=" + contrasenia + ", listaTelefono=" + listaTelefono + "]";
	}
}
