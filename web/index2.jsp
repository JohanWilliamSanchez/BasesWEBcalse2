<%-- 
    Document   : index2
    Created on : 17/08/2018, 12:02:22 PM
    Author     : LabingXEON
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 

String nombre = (String)request.getAttribute("Nombre");
String apellido = (String) request.getAttribute("Apellido");
%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido <%=nombre%><%=apellido%> a Hello World! </h1>
       
    </body>
</html>
