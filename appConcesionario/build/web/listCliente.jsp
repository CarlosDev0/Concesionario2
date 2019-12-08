<%-- 
    Document   : Cliente
    Created on : 8/12/2019, 12:43:49 AM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clientes</title>
    </head>
    <body>
        <h1>Hello World!</h1>
          <jsp:include page="menu.jsp"></jsp:include>
        <h1>Listado de Clientes!</h1>
        <c:forEach var="a" items="${Cliente}}">
            |${a.idCliente}| |${a.nombreCliente}| |${a.ciudad}|
            <a onclick="return confirm('Está segudo?')" href="ConceServlet?action=deleteCliente&id=${a.idCliente}">Delete</a>
            <hr/>
        </c:forEach>
    </body>
</html>
