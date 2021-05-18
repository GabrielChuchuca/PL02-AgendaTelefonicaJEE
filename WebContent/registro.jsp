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
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<h4 class="text-center text-success">Formulario de Registro</h4>
						<form action="registrar" method="post">
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Ingrese su numero de cedula </label> 
								<input name="cedula" type="text" class="form-control" id="cedula" aria-describedby="emailHelp" onblur="validar()" maxlength="10" onkeypress="return valideKey(event);">
								<span id="salida"></span>
							</div>
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Ingrese su Nombre </label> 
								<input name="nombre" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" onkeypress="return soloLetras(event)">
							</div>
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Ingrese su Apellido </label> 
								<input name="apellido" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" onkeypress="return soloLetras(event)">
							</div>
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Correo Electronico</label> 
								<input name="correo" type="email" class="form-control" id="email" aria-describedby="emailHelp">
								<span id="emailOK" style="color: #a1cc1b"></span>
							</div>
							<div class="mb-3">
								<label for="exampleInputPassword1" class="form-label">Contraseña</label>
								<input name="contrasenia" type="password" class="form-control" id="txtPassword">
								<button id="show_password" class="btn btn-primary" type="button" onclick="mostrarPassword()"> 
									<span class="fa fa-eye-slash icon"></span> 
								</button>
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
	<script type="text/javascript">
	    function validar() {
	      var cad = document.getElementById("cedula").value.trim();
	      var total = 0;
	      var longitud = cad.length;
	      var longcheck = longitud - 1;
	
	      if (cad !== "" && longitud === 10){
	        for(i = 0; i < longcheck; i++){
	          if (i%2 === 0) {
	            var aux = cad.charAt(i) * 2;
	            if (aux > 9) aux -= 9;
	            total += aux;
	          } else {
	            total += parseInt(cad.charAt(i)); // parseInt o concatenará en lugar de sumar
	          }
	        }
	
	        total = total % 10 ? 10 - total % 10 : 0;
	
	        if (cad.charAt(longitud-1) == total) {
	          //document.getElementById("salida").innerHTML = ("Cedula Válida");
	      	  document.getElementById("salida").innerHTML = "<span style='color: #a1cc1b'>Cedula Correcta</span>"
	        }else{
	          //document.getElementById("salida").innerHTML = ("Cedula Inválida");
	      	  document.getElementById("salida").innerHTML = "<span style='color: #ed1b24'>Cedula Incorrecta</span>"
	        }
	      }
	    }
	    
	    function soloLetras(e) {
	  	    var key = e.keyCode || e.which,
	  	      tecla = String.fromCharCode(key).toLowerCase(),
	  	      letras = " áéíóúabcdefghijklmnñopqrstuvwxyz",
	  	      especiales = [8, 37, 39, 46],
	  	      tecla_especial = false;
	
	  	    for (var i in especiales) {
	  	      if (key == especiales[i]) {
	  	        tecla_especial = true;
	  	        break;
	  	      }
	  	    }
	
	  	    if (letras.indexOf(tecla) == -1 && !tecla_especial) {
	  	      return false;
	  	    }
	  	  }
	    
	    function valideKey(evt){
	  	    
	  	    // code is the decimal ASCII representation of the pressed key.
	  	    var code = (evt.which) ? evt.which : evt.keyCode;
	  	    
	  	    if(code==8) { // backspace.
	  	      return true;
	  	    } else if(code>=48 && code<=57) { // is a number.
	  	      return true;
	  	    } else{ // other keys.
	  	      return false;
	  	    }
	  	}
	    
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
	<div style="margin-top: 80px">
		<%@include file="Componentes/footer.jsp"%>
	</div>

</body>
</html>