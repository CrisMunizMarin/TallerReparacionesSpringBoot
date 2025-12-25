package TallerReparacionesSpringBoot.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import TallerReparacionesSpringBoot.entities.Estado;
import TallerReparacionesSpringBoot.entities.Reparacion;
import TallerReparacionesSpringBoot.entities.Usuario;
import TallerReparacionesSpringBoot.entities.Vehiculo;

public interface ReparacionRepository extends JpaRepository<Reparacion, Long>{
	
	//Búsqueda por el estado de la reparacion
	List<Reparacion> findReparacionByEstado(Estado estado);
	
	//Búsqueda de reparación de un vehiculo
	List<Reparacion> findReparacionByVehiculo(Vehiculo vehiculo);
	
	//Búsqueda de reparaciones por Id del vehiculo
	List<Reparacion> findReparacionByIdVehiculo(Long vehiculo_id);
	
	//Búsqueda reparación por usuario asignado (mecanico)
	List<Reparacion> findReparacionByUsuario(Usuario usuario);
	
	//Búsqueda de reparaciones por Id del usuario asignado(mecanico)
	List<Reparacion> findReparacionByIdUsuario(int usuario_id);
	
	//Búsqueda de reparaciones por fecha
	List<Reparacion> findReparacionByFechaEntrada(LocalDate fecha_entrada);
	
	//Otras búsquedas que me pueden servir
	//Búsqueda por estado y usuario
	List<Reparacion> findReparacionByEstadoYUsuario(Estado estado, Usuario usuario);
}
