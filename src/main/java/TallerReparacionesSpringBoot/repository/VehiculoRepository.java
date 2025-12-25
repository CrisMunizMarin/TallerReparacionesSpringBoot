package TallerReparacionesSpringBoot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import TallerReparacionesSpringBoot.entities.Cliente;
import TallerReparacionesSpringBoot.entities.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long>{
	
	//Búsqueda por matrícula
	Vehiculo findByMatricula(String matricula);
	
	//Búsqueda de todos los vehiculos de un cliente(Dueño)
	List<Vehiculo> findByCliente(Cliente cliente);
	
	//Búsqueda por Id del cliente(Dueño)
	List<Vehiculo> findByIdCliente(Long id_cliente);

}
