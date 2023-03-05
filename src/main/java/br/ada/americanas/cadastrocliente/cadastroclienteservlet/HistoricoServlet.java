package br.ada.americanas.cadastrocliente.cadastroclienteservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "HistoricoServlet", value = "/historico")
public class HistoricoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession sessionUsuario = request.getSession(true);
        var clientesCadastrados = (List<Cliente>) sessionUsuario.getAttribute("historico_cadastros");//criar uma classe cliente
        if (clientesCadastrados == null) {
            clientesCadastrados = new ArrayList<>();
        }
        request.setAttribute("historico_cadastros", clientesCadastrados);
        request.getRequestDispatcher("/historico.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
