package pe.edu.cibertec.proyecto_dawii.response;

import pe.edu.cibertec.proyecto_dawii.entity.Usuario;

public record LoginResponse(String code, String error, String tokern, Usuario usuario) {
}
