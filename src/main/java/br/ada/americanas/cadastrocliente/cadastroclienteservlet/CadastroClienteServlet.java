package br.ada.americanas.cadastrocliente.cadastroclienteservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CadastroClienteServlet", value = "/cadastrarCliente")
public class CadastroClienteServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = String.valueOf(Integer.valueOf(request.getParameter("nome")));
        String cpf = String.valueOf(request.getParameter("cpf"));

        PrintWriter writer = response.getWriter();
        writer.println("<html><body>Cliente nome: " + nome + ", cpf: " + cpf + " foi cadastrado com sucesso.</body></html>");
    }

}
