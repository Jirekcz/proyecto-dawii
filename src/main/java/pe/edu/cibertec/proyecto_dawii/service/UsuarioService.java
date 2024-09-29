package pe.edu.cibertec.proyecto_dawii.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.proyecto_dawii.entity.Usuario;
import pe.edu.cibertec.proyecto_dawii.repository.UsuarioRepository;
import pe.edu.cibertec.proyecto_dawii.response.FindUsuarioResponse;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/Buscar")
    public FindUsuarioResponse buscarUsuario(@RequestParam(value = "id", defaultValue = "0") Integer id) {
        Iterable<Usuario> usuarios;
        if (id > 0) {
            usuarios = usuarioRepository.findAllById(List.of(id));
        } else {
            usuarios = usuarioRepository.findAll();
        }
        return new FindUsuarioResponse("01", null, usuarios);
    }


}
