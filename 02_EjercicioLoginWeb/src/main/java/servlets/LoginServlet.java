package servlets;

import java.io.IOException;

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
		String mNotSucces = "USERNAME OR PASSWORD IS INCORRECT ENSURE U ARE ENTER VALID VALUES";

		Usuario user = new Usuario();
		user.setUsername(username);
		user.setPassword(password);

		Usuario[] listaUsuarios = new Usuario[3];
		listaUsuarios[0].setUsername("Usuario");
		listaUsuarios[0].setPassword("contraseñaSuperSecreta");
		listaUsuarios[1].setUsername("Usuario2");
		listaUsuarios[1].setPassword("1234");
		listaUsuarios[2].setUsername("xX_Usuario3_Xx");
		listaUsuarios[2].setPassword("fechademicumple");

		for (int i = 0; i < listaUsuarios.length; i++) {
			if (user.getUsername() == listaUsuarios[i].getUsername()
					&& user.getPassword() == listaUsuarios[i].getPassword()) {
				RequestDispatcher rd = request.getRequestDispatcher("JspLoginSucces.jsp");
				request.setAttribute("user", user);
				request.setAttribute("mSucces", mSucces);
				request.setAttribute("mNSucces", mNotSucces);
				rd.forward(request, response);
			}

			if (user.getUsername() != listaUsuarios[i].getUsername()
					|| user.getPassword() != listaUsuarios[i].getPassword()) {
				RequestDispatcher rd = request.getRequestDispatcher("JspLoginSucces.jsp");
				request.setAttribute("user", user);
				request.setAttribute("mSucces", mSucces);
				request.setAttribute("mNSucces", mNotSucces);
				rd.forward(request, response);
			}

		}

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		// doGet(request, response);
	}

}
