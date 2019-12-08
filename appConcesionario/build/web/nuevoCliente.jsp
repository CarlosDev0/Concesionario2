<%-- 
    Document   : nuevoCliente
    Created on : 8/12/2019, 11:41:15 AM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresar Cliente</title>
    </head>
   <body>
        <jsp:include page="menu.jsp"></jsp:include>
        <div class="container well">
            <form action="ConceServlet?action=insertCliente" method="post">
                <table>
                    <tr>
                        <th><label>IdCliente</label></th>
                        <th><input type="text" placeholder="Enter Nombre" class="form-control" name="IdCliente" required=""></th>
                    </tr>
                    <tr>
                        <th><label>Nombre</label></th>
                        <th><input type="text" placeholder="Enter Nombre Cliente" class="form-control" name="NombreCliente" required=""></th>
                    </tr>
                     <tr>
                        <th><label>Ciudad</label></th>
                        <th><input type="text" placeholder="Enter Ciudad" class="form-control" name="Ciudad" required=""></th>
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
