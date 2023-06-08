package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ParcelaModelo extends Conector {

	// select * from parcelas
	public ArrayList<Parcela> getParcelas() {
		ArrayList<Parcela> parcelas = new ArrayList<Parcela>();

		String select = "select * from parcelas";
		try {
			PreparedStatement Pst = super.conexion.prepareStatement(select);
			ResultSet resultSet = Pst.executeQuery(select);
			while (resultSet.next()) {
				Parcela parcela = new Parcela();
				parcela.setId(resultSet.getInt(1));
				parcela.setNumero(resultSet.getString(2));
				parcela.setM_cuadrados(resultSet.getInt(3));
				parcela.setPrecio_dia(resultSet.getDouble(4));

				parcelas.add(parcela);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return parcelas;

	}

	public Parcela getParcela(int id) {

		Parcela parcela = new Parcela();
		String select = "select * from parcelas where id="+id;
		try {
			PreparedStatement Pst = super.conexion.prepareStatement(select);
			ResultSet resultSet = Pst.executeQuery(select);
			//Pst.setInt(1, id);
			resultSet.next();

			parcela.setId(resultSet.getInt(1));
			parcela.setNumero(resultSet.getString(2));
			parcela.setM_cuadrados(resultSet.getInt(3));
			parcela.setPrecio_dia(resultSet.getDouble(4));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return parcela;

	}

}
