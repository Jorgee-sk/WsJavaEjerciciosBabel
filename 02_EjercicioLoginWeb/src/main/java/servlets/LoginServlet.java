package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidad.Usuario;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String mSucces = "LOGIN SUCCESSFULLY!";
		String mNotSucces = "USERNAME OR PASSWORD IS INCORRECT ENSURE U ARE ENTERING VALID VALUES";

		Usuario user = new Usuario();
		user.setUsername(username);
		user.setPassword(password);

		Usuario user1 = new Usuario("Usuario", "superSecreto");
		Usuario user2 = new Usuario("Usuario2", "1234");
		Usuario user3 = new Usuario("xX_Usuario3_Xx", "fechademicumple");

		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		listaUsuarios.add(user1);
		listaUsuarios.add(user2);
		listaUsuarios.add(user3);

		System.out.println(user.getUsername());
		
		
		//Comprobamos primero si coincide con alguno de los 3 nombres
		for (int i = 0; i < 3; i++) {
			if (user.getUsername().equals(listaUsuarios.get(i).getUsername())
					&& user.getPassword().equals(listaUsuarios.get(i).getPassword())) {
				RequestDispatcher rd = request.getRequestDispatcher("JspLoginSucces.jsp");
				request.setAttribute("user", user);
				request.setAttribute("mSucces", mSucces);
				request.setAttribute("mNSucces", mNotSucces);
				rd.forward(request, response);
			}
		}
		
		//En cualquier otro caso vamos a saber que no ha sido successfull!
		RequestDispatcher rd = request.getRequestDispatcher("JspLoginNotSucces.jsp");
		request.setAttribute("user", user);
		request.setAttribute("mSucces", mSucces);
		request.setAttribute("mNSucces", mNotSucces);
		rd.forward(request, response);
		
		

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		// doGet(request, response);
	}

}
