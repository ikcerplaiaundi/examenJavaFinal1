package modelo;

import java.util.Date;

/**
 * 
 * @author Eñaut
 * Esta clase DTO representa la entidad
 * RESERVA de la BBDD
 *
 */
public class Reserva {
	private int id;
	private String nombre_usuario;
	private String apellido_usuario;
	private String dni_usuario;
	private int numero_usuarios;
	private String inicio_reserva;
	private String fin_reserva;
	private String fecha_reserva;
	private boolean luz;
	private int id_parcela;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	public String getApellido_usuario() {
		return apellido_usuario;
	}
	public void setApellido_usuario(String apellido_usuario) {
		this.apellido_usuario = apellido_usuario;
	}
	public String getDni_usuario() {
		return dni_usuario;
	}
	public void setDni_usuario(String dni_usuario) {
		this.dni_usuario = dni_usuario;
	}
	public int getNumero_usuarios() {
		return numero_usuarios;
	}
	public void setNumero_usuarios(int numero_usuarios) {
		this.numero_usuarios = numero_usuarios;
	}
	public String getInicio_reserva() {
		return inicio_reserva;
	}
	public void setInicio_reserva(String inicio_reserva) {
		this.inicio_reserva = inicio_reserva;
	}
	public String getFin_reserva() {
		return fin_reserva;
	}
	public void setFin_reserva(String fin_reserva) {
		this.fin_reserva = fin_reserva;
	}
	public String getFecha_reserva() {
		return fecha_reserva;
	}
	public void setFecha_reserva(String fecha_reserva) {
		this.fecha_reserva = fecha_reserva;
	}
	public boolean getLuz() {
		return luz;
	}
	public void setLuz(boolean luz) {
		this.luz = luz;
	}
	public int getId_parcela() {
		return id_parcela;
	}
	public void setId_parcela(int id_parcela) {
		this.id_parcela = id_parcela;
	}
	
	
}
