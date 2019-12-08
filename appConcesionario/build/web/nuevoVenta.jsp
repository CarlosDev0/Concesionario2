<%-- 
    Document   : nuevoVenta
    Created on : 8/12/2019, 11:50:32 AM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresar Venta</title>
    </head>
    <body>
        <jsp:include page="menu.jsp"></jsp:include>
        <div class="container well">
            <form action="ConceServlet?action=insertVenta" method="post">
                <table>
                    <tr>
                        <th><label>IdVenta</label></th>
                        <th><input type="text" placeholder="Enter IdVenta" class="form-control" name="IdVenta" required=""></th>
                    </tr>
                    <tr>
                        <th><label>Vehiculo</label></th>
                        <th><input type="text" placeholder="Enter IdVehiculo" class="form-control" name="IdVehiculo" required=""></th>
                    </tr>
                     <tr>
                        <th><label>CLIENTE</label></th>
                        <th><input type="text" placeholder="Enter IdCliente" class="form-control" name="IdCliente" required=""></th>
                    </tr>
                    <tr>
                        <th><label>Precio</label></th>
                        <th><input type="text" placeholder="Enter Precio" class="form-control" name="Precio" required=""></th>
                    </tr>
                    <tr>
                        <th><label>FechaVenta</label></th>
                        <th><input type="text" placeholder="Enter FechaVenta" class="form-control" name="FechaVenta" required=""></th>
                    </tr>
                    <tr>
                    <input class="btn icon-btn btn-success" type="submit" name="action" value="Insertar">
                    <input class="btn btn-info btn-lg" type="reset" name="action" value="reset">
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
