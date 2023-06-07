package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class ReservaModelo extends Conector{
/*
	"INSERT INTO reservas(nombre_usuario, apellido_usuario, dni_usuario, numero_usuarios, inicio_reserva, fin_reserva,  luz, id_parcela) "
			+ "VALUES (?,?,?,?,?,?,?,?)"
			
	"DELETE FROM reservas WHERE id = ?"
		*/
		
	public void insetReserva(Parcela parcela,Reserva reserva) {
		String insert = "INSERT INTO reservas( nombre_usuario, apellido_usuario, dni_usuario, numero_usuarios, inicio_reserva, fin_reserva,  luz, id_parcela) VALUES (?,?,?,?,?,?,?,?,?)";
		PreparedStatement Pst;
		try {
			Pst = super.conexion.prepareStatement(insert);
			Pst.setString(1, reserva.getNombre_usuario());
			Pst.setString(2, reserva.getApellido_usuario());
			Pst.setString(3, reserva.getDni_usuario());
			Pst.setInt(4, reserva.getNumero_usuarios());
			Pst.setString(5, reserva.getInicio_reserva());
			Pst.setString(6,reserva.getFin_reserva());
			Pst.setBoolean(7, reserva.getLuz());
			Pst.setInt(8, reserva.getId_parcela());
			Pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	public void deleteReserva(int id) {
		String delete="delete * from reservas where id=?";
		try {
			PreparedStatement Pst = super.conexion.prepareStatement(delete);
			Pst.setInt(1, id);
			Pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
