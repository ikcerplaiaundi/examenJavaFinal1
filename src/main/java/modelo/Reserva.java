package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
	private Date inicio_reserva;
	private Date fin_reserva;
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

	public Date getInicio_reserva() {
		return inicio_reserva;
	}
	public void setInicio_reserva(Date inicio_reserva) {
		this.inicio_reserva = inicio_reserva;
	}
	public void setInicio_reserva(String dateString)  {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			this.inicio_reserva = sdf.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public Date getFin_reserva() {
		return fin_reserva;
	}
	public void setFin_reserva(Date fin_reserva) {
		this.fin_reserva = fin_reserva;
	}
	public void setFin_reserva(String dateString)  {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			this.fin_reserva = sdf.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
