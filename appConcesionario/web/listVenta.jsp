<%-- 
    Document   : listVenta
    Created on : 8/12/2019, 10:59:43 AM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ventas</title>
    </head>
   <body>
        <h1>Listado de Ventas</h1>
         <c:forEach var="a" items="${Venta}}">
            |${a.idVenta}| |${a.idVehiculo}| |${a.idCliente}| |${a.FechaVenta}| |${a.Precio}|
            <a onclick="return confirm('Está seguro?')" href="ConceServlet?action=deleteVenta&id=${a.idVenta}">Delete</a>
            <hr/>
        </c:forEach>
    </body>
</html>
