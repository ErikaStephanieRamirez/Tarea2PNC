package com.uca.capas.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MainServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String User = request.getParameter("User");
		String Pass = request.getParameter("Pass");
		PrintWriter out = response.getWriter();
		
		if(User.equals("Erika") && Pass.equals("erika")) {
			
			out.println("<html>");
			out.println("<body>");
			out.println("<h3>"+"Inicio de sesion exitoso...."+"<br>"+"Bienvenida "+User+"</h3>");
			out.println("</body>");
			out.println("</html>");
		}
		else {
			out.println("<html>");
			out.println("<body>");
			out.println("<h3>"+"Credenciales invalidas"+"</h3>");
			out.println("</body>");
			out.println("</html>");
		}
	}

}
