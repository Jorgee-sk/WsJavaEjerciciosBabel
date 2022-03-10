package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidad.Persona;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/JspServlets")
public class JspServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String sPeso = request.getParameter("peso");
		String m1 = "Mensaje del servlet";
		
		int iPeso = 0;
		if(sPeso != null) {
			iPeso = Integer.parseInt(sPeso);
		}
		
		Persona p = new Persona();
		p.setNombre(nombre);
		p.setApellido(apellido);
		p.setPeso(iPeso);
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("resultadoForm2.jsp");
		
		request.setAttribute("p",p);
		request.setAttribute("m1",m1);
		request.setAttribute("num",5);
		
		
		rd.forward(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
