package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import servlet.Home;

@WebServlet("/adicionaContato")
  public class AdicionaContatoServlet extends HttpServlet {

	protected void service(HttpServletRequest request,
              HttpServletResponse response)
              throws IOException, ServletException {

          PrintWriter out = response.getWriter();

          // pegando os parâmetros do request
          String nome = request.getParameter("nome");
          String endereco = request.getParameter("endereco");
          String email = request.getParameter("email");
          String dataEmTexto = request.getParameter("dataNascimento");
          Calendar dataNascimento = null;

          // fazendo a conversão da data
          try {
              Date date = new SimpleDateFormat("dd/MM/yyyy")
                      .parse(dataEmTexto);
              dataNascimento = Calendar.getInstance();
              dataNascimento.setTime(date);
          } catch (ParseException e) {
              out.println("Erro de conversão da data");
              return; //para a execução do método
          }

          // monta um objeto contato
          Contato contato = new Contato();
          contato.setNome(nome);
          contato.setEndereco(endereco);
          contato.setEmail(email);
          contato.setDataNascimento(dataNascimento);

          // salva o contato
          
          Agenda agenda = Agenda.getAgenda();

          agenda.addContato(nome, contato);

          // imprime o nome do contato que foi adicionado
          out.println("<html>");
          out.println("<body>");
          out.println("Contato " + contato.getNome() +
                  " adicionado com sucesso");       
          out.println("</body>");
          out.println("</html>");
      }
  }