package pe.edu.cibertec.proyecto_dawii.repository;

import org.springframework.data.repository.CrudRepository;
import pe.edu.cibertec.proyecto_dawii.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
    Usuario findByUser(String username);
}
