 <%@page import="servlet.Agenda"%>
  <%@page import="servlet.Contato"%>
   <%@page import="java.util.HashMap"%>
 
  <html>
    <body>
    <table>
    <%
    Agenda agenda = Agenda.getAgenda();
    HashMap<String,Contato> contatosDB = agenda.getContatos();

      for (Contato value : contatosDB.values() ) {
    %>
      <tr>
        <td><%=value.getNome() %></td>
        <td><%=value.getEmail() %></td>
        <td><%=value.getEndereco() %></td>
        <td><%=value.getDataNascimento().getTime() %></td>
      </tr>
    <%
      }
    %>
  </table>
   
    </body>
  </html>
