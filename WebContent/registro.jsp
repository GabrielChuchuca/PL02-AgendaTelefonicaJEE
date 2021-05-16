<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="Componentes/estilos.jsp"%>
</head>
<body style="background-color: #f7faf8;">
	<%@include file="Componentes/navbar.jsp"%>
	<div class="conatiner-fluid">
		<div class="row p-2">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<h4 class="text-center text-success">Formulario de Registro</h4>

						<%
							String sucssMsg = (String) session.getAttribute("sucssMsg");
						String errorMsg = (String) session.getAttribute("errorMsg");

						if (sucssMsg != null) {
						%>
						<p class="text-success text-center"><%=sucssMsg%></p>
						<%
							session.removeAttribute("sucssMsg");
						}

						if (errorMsg != null) {
						%>
						<p class="text-danger text-center"><%=errorMsg%>>
						</p>
						<%
							session.removeAttribute("errorMsg");
						}
						%>
						<form action="/AgendaTelefónicaJEE/registrar" method="post">
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Ingrese
									su numero de cedula </label> <input name="cedula" type="text"
									class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp">
							</div>
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Ingrese
									su Nombre </label> <input name="nombre" type="text"
									class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp">
							</div>
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Ingrese
									su Apellido </label> <input name="apellido" type="text"
									class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp">
							</div>
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Correo
									Electronico</label> <input name="correo" type="email"
									class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp">
							</div>
							<div class="mb-3">
								<label for="exampleInputPassword1" class="form-label">Contraseña</label>
								<input name="contrasenia" type="password" class="form-control"
									id="exampleInputPassword1">
							</div>
							<div class="text-center mt-2">
								<button type="submit" class="btn btn-primary">Registrarse</button>
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