package br.ada.americanas.cadastrocliente.cadastroclienteservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ClienteSessionServlet", value = "/calcular")
public class ClienteSessionServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = String.valueOf(Integer.valueOf(request.getParameter("nome")));
        String cpf = String.valueOf(request.getParameter("cpf"));
        Cliente cliente = new Cliente ();
        cliente.setNome(nome);
        cliente.setCpf(cpf);

        PrintWriter writer = response.getWriter();
        writer.println("<html><body>Cliente nome: " + nome + ", cpf: " + cpf + " foi cadastrado com sucesso.</body></html>");

//        var result = service.executar(first, second, operator);
        var clientesCadastrados = recuperarClientesCadastrados(request);
        clientesCadastrados.add(cliente);

//        request.setAttribute("result", result);
//        request.setAttribute("operator", operator);
        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }

    private List<Cliente> recuperarClientesCadastrados(HttpServletRequest request) {
        HttpSession session = request.getSession(true);
        List<Cliente> clientesCadastrados = (List<Cliente>) session.getAttribute("historico_operacoes");
        if (clientesCadastrados == null) {
            clientesCadastrados = new ArrayList<>();
            session.setAttribute("historico_operacoes", clientesCadastrados);
        }
        return clientesCadastrados;
    }

}
