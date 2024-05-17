package UTN.TP4_GRUPO_15.entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Paciente implements Serializable{

	private static final long serialVersionUID = 1L;

	private String nombre;
	private String apellido;
	private int dni;
	private int telefono;
	private String direccion;
	private String localidad;
	private String provincia;
	private Date fechaNacimiento;
	private String Correo;
	
	public Paciente() {
		super();
	}

	public Paciente(String nombre, String apellido, int dni, int telefono, String direccion, String localidad,
			String provincia, Date fechaNacimiento, String correo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.direccion = direccion;
		this.localidad = localidad;
		this.provincia = provincia;
		this.fechaNacimiento = fechaNacimiento;
		Correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", telefono=" + telefono
				+ ", direccion=" + direccion + ", localidad=" + localidad + ", provincia=" + provincia
				+ ", fechaNacimiento=" + fechaNacimiento + ", Correo=" + Correo + "]";
	}

	
	
	
}
