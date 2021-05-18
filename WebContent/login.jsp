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
<header>
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
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
			
			<form class="form-inline my-2 my-lg-0">
				<a href="login.jsp" class="btn btn-success">
					<i class="far fa-user"></i> Iniciar Sesión
				</a> 
				<a href="registro.jsp" class="btn btn-danger ml-2">
					<i class="fas fa-users"></i> Registrarse
				</a>
			</form>
		</div>
	</nav>
</header>
<div class="conatiner-fluid">
	<div class="row p-2">
		<div class="col-md-4 offset-md-4">
			<div class="card">
				<div class="card-body">
					<h4 class="text-center text-success">Iniciar Sesión</h4>
					<form action="login" method="post">
						<div class="mb-3">
							<label for="exampleInputEmail1" class="form-label">Correo Electronico</label> 
							<input name="correo" type="email" class="form-control" id="email" aria-describedby="emailHelp">
							<span id="emailOK"></span>
						</div>
						<div class="mb-3">
							<label for="exampleInputPassword1" class="form-label">Contraseña</label>
							<input name="contrasenia" type="password" class="form-control" id="txtPassword">
							<button id="show_password" class="btn btn-primary" type="button" onclick="mostrarPassword()">
								<span class="fa fa-eye-slash icon"></span>
							</button>
						</div>
						<div class="text-center mt-2">
							<button type="submit" class="btn btn-primary">Ingresar</button>
						</div>
					</form>

				</div>
			</div>
		</div>
	</div>
</div>

<script type="text/javascript">
    function mostrarPassword(){
		var cambio = document.getElementById("txtPassword");
		if(cambio.type == "password"){
			cambio.type = "text";
			$('.icon').removeClass('fa fa-eye-slash').addClass('fa fa-eye');
		}else{
			cambio.type = "password";
			$('.icon').removeClass('fa fa-eye').addClass('fa fa-eye-slash');
		}
	} 
	
    document.getElementById('email').addEventListener('input', function() {
  	    campo = event.target;
  	    valido = document.getElementById('emailOK');
  	        
  	    emailRegex = /^[-\w.%+]{1,64}@(?:[A-Z0-9-]{1,63}\.){1,125}[A-Z]{2,63}$/i;
  	    //Se muestra un texto a modo de ejemplo, luego va a ser un icono
  	    if (emailRegex.test(campo.value)) {

  	      //valido.innerText = "válido";
  	      valido.innerHTML = "<span style='color: #a1cc1b'>Correo Valido</span>"
  	      //valido.innerHTML = "<style: color: #a1cc1b>" + "valido" + "</style>";
  	    } else {
  	      //valido.innerText = "incorrecto";
  	      //valido.innerHTML = "<style: color: #d9cc00>" + "invalido" + "</style>";
  	    	valido.innerHTML = "<span style='color: #ed1b24'>Correo Incorrecto</span>"
  	    }
  	});
</script>

<div style="margin-top: 140px">
	<%@include file="Componentes/footer.jsp"%>
</div>
</body>
</html>