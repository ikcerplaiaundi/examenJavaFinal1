package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Parcela;
import modelo.ParcelaModelo;
import modelo.ReservaModelo;

/**
 * Servlet implementation class IniciarReserva
 */
@WebServlet("/IniciarReserva")
public class IniciarReserva extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IniciarReserva() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ParcelaModelo parcelaM = new ParcelaModelo();
		Parcela parcela =new Parcela();
		parcela.setId(Integer.parseInt((String) request.getAttribute("id")));
		parcela = parcelaM.getParcela(parcela.getId());
		
		if(request.getAttribute("idEleminar")!=null) {
			ReservaModelo reservaM =new ReservaModelo();
			reservaM.deleteReserva(Integer.parseInt((String) request.getAttribute("idEleminar")));
		}
		
		//se abrirá la vista formReserva.jsp
		request.setAttribute("parcela", parcela);
		request.getRequestDispatcher("formReserva.jsp").forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
