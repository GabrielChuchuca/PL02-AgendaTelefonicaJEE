<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="ec.edu.ups.modelo.Usuario"%>
<%@page import="ec.edu.ups.modelo.Telefono"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Añadir Telefono</title>
<%@include file="Componentes/estilos.jsp"%>
</head>
<body style="background-color: #f7faf8;">
<header>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
<%Usuario user = (Usuario) session.getAttribute("usuario");%>
		<a class="navbar-brand" href="pagina.jsp">
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
	<div class="conatiner-fluid">
		<div class="row p-2">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<h4 class="text-center text-success">Añadir Numero Telefono</h4>

						
						<form action="agregar" method="post">
							<input type="hidden" value="<%=user.getCedula()%>" name="cedula" />
							<input type="hidden" value="<%=user.getCedula()%>" name="cedula" />


							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Numero
								</label> <input name="numero" type="text" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp">
							</div>
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Operadora
								</label> <input name="operadora" type="text" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp">
							</div>
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Tipo
								</label> <input name="tipo" type="text" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp">
							</div>

							<div class="text-center mt-2">
								<button type="submit" class="btn btn-success">Añadir
									Telefono</button>
							</div>
						</form>

					</div>
				</div>
			</div>
		</div>
	</div>

	<div style="margin-top: 80px">
		<%@include file="Componentes/footer.jsp"%>
	</div>

</body>
</html>