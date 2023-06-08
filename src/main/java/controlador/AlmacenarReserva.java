package controlador;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Parcela;
import modelo.ParcelaModelo;
import modelo.Reserva;
import modelo.ReservaModelo;

/**
 * Servlet implementation class ConfirmarReserva
 */
@WebServlet("/AlmacenarReserva")
public class AlmacenarReserva extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlmacenarReserva() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ParcelaModelo parcelaM =new ParcelaModelo ();
		Parcela parcela =new Parcela();
		parcela.setId(Integer.parseInt((String) request.getParameter("id_parcela")));
		parcela = parcelaM.getParcela(Integer.parseInt((String) request.getParameter("id_parcela")));
		//se abrirá la vista infoReserva
		request.setAttribute("parcela", parcela);
		request.setAttribute("reserva", reserva);
		request.getRequestDispatcher("infoReserva.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	private static Reserva reserva =new Reserva();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		reserva.setId_parcela( Integer.parseInt((String) request.getParameter("id_parcela")));
		reserva.setNombre_usuario((String) request.getParameter("nombre"));
		reserva.setApellido_usuario((String) request.getParameter("apellido"));
		reserva.setDni_usuario((String) request.getParameter("dni"));
		reserva.setNumero_usuarios(Integer.parseInt((String) request.getParameter("numero_personas")));
		reserva.setInicio_reserva((String) request.getParameter("fecha_inicio"));
        reserva.setFin_reserva((String) request.getParameter("fecha_fin"));
		
		if( request.getParameter("luz")!=null) {
			reserva.setLuz(true);
		}else {
			reserva.setLuz(false);
		}
		
		doGet(request, response);
	}

}
