package UTN.TP4_GRUPO_15.entidad;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Especialidad implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String nombre;
	
	
	public Especialidad() {
		super();
	}


	public Especialidad(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Especialidad [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
	
	
}
