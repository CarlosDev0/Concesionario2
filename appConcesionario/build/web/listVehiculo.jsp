<%-- 
    Document   : listVehiculo
    Created on : 8/12/2019, 10:54:08 AM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vehiculos</title>
    </head>
    <body>
        <h1>Listado de Vehículos</h1>
         <c:forEach var="a" items="${Vehiculo}}">
            |${a.idVehiculo}| |${a.marca}| |${a.modelo}|
            <a onclick="return confirm('Está seguro?')" href="ConceServlet?action=deleteVehiculo&id=${a.idVehiculo}">Delete</a>
            <hr/>
        </c:forEach>
    </body>
</html>
