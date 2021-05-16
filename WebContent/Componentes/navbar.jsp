<%@page import="ec.edu.ups.modelo.Usuario"%>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
	<a class="navbar-brand" href="index.jsp"><i class="fas fa-phone-square-alt">
	</i> Agenda Telefonica</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		
		
		<% Usuario user = (Usuario)session.getAttribute("user"); 
		if(user==null)
		{%>
		
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link" href="index.jsp"><i class="fas fa-home">
			</i> Inicio
					<span class="sr-only">(current)</span>
			</a></li>
		</ul>
		
		<form class="form-inline my-2 my-lg-0">
			<a href="login.jsp" class="btn btn-success"><i class="far fa-user">
			</i> Iniciar Sesión</a> 
			<a href="registro.jsp" class="btn btn-danger ml-2"><i class="fas fa-users">
			</i> Registrarse</a>
		</form>
				
		<%
		}else{
		%>
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link" href="index.jsp"><i class="fas fa-home">
			</i> Inicio
					<span class="sr-only">(current)</span>
			</a></li>
			<li class="nav-item active"><a class="nav-link"
				href="añadirContacto.jsp"><i class="fas fa-plus-square">
				</i> Añadir Numero de Telefono</a></li>

			<li class="nav-item active"><a class="nav-link" href="verContacto.jsp"><i class="fas fa-eye">
			</i> Ver Numeros de Telefono</a></li>
		</ul>
		
		<form class="form-inline my-2 my-lg-0">	
			<button class="btn btn-success"><%=user.getNombre() %> <%=user.getApellido() %> </button>
			<a href="salir" class="btn btn-danger ml-2">Salir</a>
		</form>
		<%
		}
		%>
		
	</div>
</nav>