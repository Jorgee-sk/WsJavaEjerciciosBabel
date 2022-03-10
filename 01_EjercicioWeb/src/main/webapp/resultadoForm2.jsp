<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!--  Un JSP es un SERVLET -->
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="color: blue; text-align: center;">Bienvenido</h1>
	<!-- Scriptlets (NO RECOMENDADO)-->
	<%
		
		String mens = request.getParameter("m1");
		String num = request.getParameter("num");
	%>
	<h2><%=mens %></h2>
	<h2><%=num %></h2>
	<hr/>
	
	<!-- MEJOR FORMA 
	Accedemos directamente a los atributos mediante
	${claveAtributo}
	-->
	<h2>${p.nombre}</h2>
	<h2>${p.apellido}</h2>
	<h2>${p.peso}</h2>
	<h2>${m1}</h2>
	<h2>${num}</h2>
	<hr/>
	
	
</body>
</html>