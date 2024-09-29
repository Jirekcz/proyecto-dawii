package pe.edu.cibertec.proyecto_dawii.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.proyecto_dawii.entity.Usuario;
import pe.edu.cibertec.proyecto_dawii.repository.UsuarioRepository;
import pe.edu.cibertec.proyecto_dawii.response.LoginResponse;
import pe.edu.cibertec.proyecto_dawii.security.JWTAuthenticationConfig;

@RestController
@RequestMapping("/user")
public class UserService {

    @Autowired
    UsuarioRepository userRepository;

    @Autowired
    JWTAuthenticationConfig jwtAuthenticationConfig;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/login")
    public LoginResponse login(@RequestBody Usuario user) {

        Usuario userResult = userRepository.findByUser(user.getUsername());

        if (userResult == null) {
            return new LoginResponse("99", "Usuario no encontrado", null,null);
        }

        if (!(user.getPassword().matches(userResult.getPassword()))) {
            return new LoginResponse("99", "Password incorrecto", null,null);
        }
        String token = jwtAuthenticationConfig.getJWTToken(user.getUsername());

        return new LoginResponse("01", null, token, userResult);
    }
}
