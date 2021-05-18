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
</head>

<body>
<header>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
<%Usuario user = (Usuario) session.getAttribute("usuario");%>
		<a class="navbar-brand" href="index.jsp">
			<i class="fas fa-phone-square-alt"></i> Agenda Telefonica
		</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"></li>
			</ul>
			<ul class="navbar-nav mr-auto">
			<li class="nav-item active"></li>
			<li class="nav-item active"><a class="nav-link"
				href="anadirTelefono.jsp"><i class="fas fa-plus-square">
				</i> Añadir Numero de Telefono</a></li>

			<li class="nav-item active"><a class="nav-link" href="verContacto.jsp"><i class="fas fa-eye">
			</i> Ver Numeros de Telefono</a></li>
		</ul>
		
		<form class="form-inline my-2 my-lg-0">	
			<h1></h1>
			<h4><%=user.getNombre()%> <%=user.getApellido()%></h4>
			<a href="salir" class="btn btn-danger ml-2">Salir</a>
		</form>
		</div>
	</nav>
</header>

	<div class="container back-img text-center text-success">
		<h1 class="mt-3">Aplicacion Agenda Telefonica</h1>
	</div>

	<%@include file="Componentes/footer.jsp"%>

</body>
</html>