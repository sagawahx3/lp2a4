package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/home")

public class Home extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request,
	          HttpServletResponse response)
	          throws ServletException, IOException {
		
	      PrintWriter out = response.getWriter();

	      out.println("<html>");
	      out.println("<head>");
	      out.println("<title>Agenda</title>");
	      out.println("</head>");
	      out.println("<body>");
	      out.println("<h1>Bem-vindo!</h1>");
	      out.println("<a href=/servlet/adiciona-contato.html>");
	      out.println("<button>Adicionar Contato</button>");
	      out.println("</a>");
	      out.println("<br>");
	      out.println("<a href=/servlet/listar-contatos.jsp>");
	      out.println("<button>Listar Contatos</button>");
	      out.println("</a>");
	      out.println("</body>");
	      out.println("</html>");
	  }
	
}