package TallerReparacionesSpringBoot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import TallerReparacionesSpringBoot.entities.Rol;
import TallerReparacionesSpringBoot.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	//Busqueda por DNI
	Usuario findByDniUsuario(String dni_usuario);
	
	//Búsqueda por Nombre
	Usuario findByNombreUsuario(String nombre_usuario);
	
	//Búsqueda por Rol
	List<Usuario> findByRol(Rol rol);
	
	//Login: Búsqueda por nombre y contraseña
	Usuario findByNombreUsuarioYPassword(String nombre_usuario, String password);
	
}
