<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/formLog.css" rel="stylesheet" type="text/css"><link>
<title>Invalid form</title>
</head>
<body>
	<div class="container1">
		<form style="text-align: center;" action="formularioLogin.html" method="get">
			<fieldset class="field-class2">
				<img class="img-invalid" src="img/cruz.png" alt="...">
				<h1 class="text-logIn-ns">FAILED TO LOG IN</h1>
				<h2 class="text-logIn-ns">USERNAME "${user.username}" OR PASSWORD "${user.password}"</h2>
				<h2 class="text-logIn-ns">${mNSucces}</h2>
				<input class="submitButton-ns"type="submit" value="RETURN TO LOG IN PAGE"/>
			</fieldset>
		</form>
	</div>

	
</body>
</html>