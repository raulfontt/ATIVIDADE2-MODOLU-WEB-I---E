<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  <head>
    <title>Historico de Clientes Cadastrados</title>
  </head>
  <body>
  <h1 align="center">Os clientes cadastrados são:</h1>
  <c:forEach items="${historico_cadastros}" var="operacao">// MUDAR "OPERACAO"
    <h3 align="center"><c:out value="${operacao}" /></h3>// MUDAR "OPERACAO"
  </c:forEach>
  </body>
</html>
