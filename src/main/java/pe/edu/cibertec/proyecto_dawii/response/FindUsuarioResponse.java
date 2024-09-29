package pe.edu.cibertec.proyecto_dawii.response;

import pe.edu.cibertec.proyecto_dawii.entity.Usuario;

public record FindUsuarioResponse(String code, String error, Iterable<Usuario>  usuarios) {
}
