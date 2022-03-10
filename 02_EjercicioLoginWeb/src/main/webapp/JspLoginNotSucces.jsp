<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="color: blue; text-align: center;">USUARIO O CONTRASEÑA INCORRECTOS</h1>
	
	<hr/>
	<!-- MEJOR FORMA 
	Accedemos directamente a los atributos mediante
	${claveAtributo}
	-->
	<h2>${user.username}</h2>
	<h2>${user.password}</h2>
	<h2>${mNotSucces}</h2>
	<hr/>
</body>
</html>