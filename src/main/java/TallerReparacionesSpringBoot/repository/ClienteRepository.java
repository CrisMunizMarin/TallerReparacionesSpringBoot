package TallerReparacionesSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import TallerReparacionesSpringBoot.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	//Metodo para buscar el cliente por DNI
	Cliente findByDni(String dni_cliente);
}
