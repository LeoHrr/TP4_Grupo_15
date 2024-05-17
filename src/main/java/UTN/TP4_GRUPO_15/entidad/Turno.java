package UTN.TP4_GRUPO_15.entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Turno implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private String medico;
	private String paciente;
	private Date fecha;
	private String hora;
	private String observacion;
	private String estado;
	public Turno() {
		super();
	}
	public Turno(String medico, String paciente, Date fecha, String hora, String observacion, String estado) {
		super();
		this.medico = medico;
		this.paciente = paciente;
		this.fecha = fecha;
		this.hora = hora;
		this.observacion = observacion;
		this.estado = estado;
	}
	public String getMedico() {
		return medico;
	}
	public void setMedico(String medico) {
		this.medico = medico;
	}
	public String getPaciente() {
		return paciente;
	}
	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Turno [medico=" + medico + ", paciente=" + paciente + ", fecha=" + fecha + ", hora=" + hora
				+ ", observacion=" + observacion + ", estado=" + estado + "]";
	}
	
	
	

}
