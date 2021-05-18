<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina Index</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous"/>
<%@include file="Componentes/estilos.jsp"%>
</head>
<body>
<header>
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
		<a class="navbar-brand" href="index.jsp">
			<i class="fas fa-phone-square-alt"></i> Agenda Telefonica
		</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"></li>
			</ul>
		
			<form class="form-inline my-2 my-lg-0">
				<a href="login.jsp" class="btn btn-success"><i class="far fa-user">
				</i> Iniciar Sesión</a> 
				<a href="registro.jsp" class="btn btn-danger ml-2"><i class="fas fa-users">
				</i> Registrarse</a>
			</form>
		</div>
	</nav>
</header>

<h1>BIENVENIDO A LA AGENDA TELFONICA</h1>

<%@include file="Componentes/footer.jsp"%>
</body>
</html>