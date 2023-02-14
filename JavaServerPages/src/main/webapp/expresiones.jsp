<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Ejemplo de expresiones JSP</H1>
	<ul>
		<li>Fecha actual: <%=new java.util.Date()%>
		<li>Nombre del host: <%=request.getRemoteHost()%>
		<li>ID de la sesi´on: <%=session.getId()%>
		<li>El ppar´ametro es: <%=request.getParameter("nombre")%>
	</ul>
</body>
</html>