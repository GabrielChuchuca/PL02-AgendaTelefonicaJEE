<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="ec.edu.ups.modelo.Usuario"%>
<%@page import="ec.edu.ups.conn.ConexionDB"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="Componentes/estilos.jsp"%>
<style type="text/css">
.back-img {
	background: url("images/phone3.jpg");
	width: 100%;
	height: 80vh;
	background-repeat: no-repeat;
	background-size: cover;
	width: 100%;
}
</style>
</head>
<body>
	<%@include file="Componentes/navbar.jsp"%>

	<div class="container back-img text-center text-success">
		<h1 class="mt-3">Aplicacion Agenda Telefonica</h1>
	</div>

	<%@include file="Componentes/footer.jsp"%>

</body>
</html>