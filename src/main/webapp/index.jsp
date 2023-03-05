<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Cliente</title>
    </head>
    <body>
    <div align="center">
        <form action="cadastrarCliente" method="post">
            <p>Informe o nome do cliente: <input type="string" name="nome" required></p>
            <p>Informe o CPF do cliente: <input type="string" name="cpf" required></p>
            <p><input type="submit" value="Cadastrar Cliente"></p>
        </form>
    </div>
    </body>
</html>