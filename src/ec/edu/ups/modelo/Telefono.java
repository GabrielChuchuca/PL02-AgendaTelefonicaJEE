/**
 * 
 */
package ec.edu.ups.modelo;

import java.io.Serializable;

/**
 * @author Gabriel Leonardo Chu
 *
 */
public class Telefono implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int codigo;
	private String numero;
	private String tipo;
	private String operadora;
	private Usuario usuario;
	
	public void Telefono() {
		
	}

	/**
	 * @param codigo
	 * @param numero
	 * @param tipo
	 * @param operadora
	 * @param usuario
	 */
	public Telefono(int codigo, String numero, String tipo, String operadora, Usuario usuario) {
		this.codigo = codigo;
		this.numero = numero;
		this.tipo = tipo;
		this.operadora = operadora;
		this.usuario = usuario;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the operadora
	 */
	public String getOperadora() {
		return operadora;
	}

	/**
	 * @param operadora the operadora to set
	 */
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Telefono [codigo=" + codigo + ", numero=" + numero + ", tipo=" + tipo + ", operadora=" + operadora
				+ ", usuario=" + usuario + "]";
	}
}
