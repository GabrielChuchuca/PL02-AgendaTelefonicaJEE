function validar() {
	var cad = document.getElementById("cedula").value.trim();
	var total = 0;
	var longitud = cad.length;
	var longcheck = longitud - 1;

	if (cad !== "" && longitud === 10) {
		for (i = 0; i < longcheck; i++) {
			if (i % 2 === 0) {
				var aux = cad.charAt(i) * 2;
				if (aux > 9)
					aux -= 9;
				total += aux;
			} else {
				total += parseInt(cad.charAt(i)); // parseInt o concatenará en
													// lugar de sumar
			}
		}

		total = total % 10 ? 10 - total % 10 : 0;

		if (cad.charAt(longitud - 1) == total) {
			// document.getElementById("salida").innerHTML = ("Cedula Válida");
			document.getElementById("salida").innerHTML = "<span style='color: #a1cc1b'>Cedula Correcta</span>"
		} else {
			// document.getElementById("salida").innerHTML = ("Cedula
			// Inválida");
			document.getElementById("salida").innerHTML = "<span style='color: #ed1b24'>Cedula Incorrecta</span>"
		}
	}
}

function soloLetras(e) {
	var key = e.keyCode || e.which, tecla = String.fromCharCode(key)
			.toLowerCase(), letras = " áéíóúabcdefghijklmnñopqrstuvwxyz", especiales = [
			8, 37, 39, 46 ], tecla_especial = false;

	for ( var i in especiales) {
		if (key == especiales[i]) {
			tecla_especial = true;
			break;
		}
	}

	if (letras.indexOf(tecla) == -1 && !tecla_especial) {
		return false;
	}
}

function valideKey(evt) {

	// code is the decimal ASCII representation of the pressed key.
	var code = (evt.which) ? evt.which : evt.keyCode;

	if (code == 8) { // backspace.
		return true;
	} else if (code >= 48 && code <= 57) { // is a number.
		return true;
	} else { // other keys.
		return false;
	}
}

function mostrarPassword() {
	var cambio = document.getElementById("txtPassword");
	if (cambio.type == "password") {
		cambio.type = "text";
		$('.icon').removeClass('fa fa-eye-slash').addClass('fa fa-eye');
	} else {
		cambio.type = "password";
		$('.icon').removeClass('fa fa-eye').addClass('fa fa-eye-slash');
	}
}

$(document).ready(
		function() {
			// CheckBox mostrar contraseña
			$('#ShowPassword').click(
					function() {
						$('#Password').attr('type',
								$(this).is(':checked') ? 'text' : 'password');
					});
		});

document
		.getElementById('email')
		.addEventListener(
				'input',
				function() {
					campo = event.target;
					valido = document.getElementById('emailOK');

					emailRegex = /^[-\w.%+]{1,64}@(?:[A-Z0-9-]{1,63}\.){1,125}[A-Z]{2,63}$/i;
					// Se muestra un texto a modo de ejemplo, luego va a ser un
					// icono
					if (emailRegex.test(campo.value)) {

						// valido.innerText = "válido";
						valido.innerHTML = "<span style='color: #a1cc1b'>Correo Valido</span>"
						// valido.innerHTML = "<style: color: #a1cc1b>" +
						// "valido" + "</style>";
					} else {
						// valido.innerText = "incorrecto";
						// valido.innerHTML = "<style: color: #d9cc00>" +
						// "invalido" + "</style>";
						valido.innerHTML = "<span style='color: #ed1b24'>Correo Incorrecto</span>"
					}
				});