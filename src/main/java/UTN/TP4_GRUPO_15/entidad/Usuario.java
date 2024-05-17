package UTN.TP4_GRUPO_15.entidad;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Usuario implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private String usuario;
	private String contraseña;
	
	public Usuario(String usuario, String contraseña) {
		super();
		this.usuario = usuario;
		this.contraseña = contraseña;
	}

	public Usuario() {
		super();
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Usuario [usuario=" + usuario + ", contraseña=" + contraseña + "]";
	}
	
	
}
