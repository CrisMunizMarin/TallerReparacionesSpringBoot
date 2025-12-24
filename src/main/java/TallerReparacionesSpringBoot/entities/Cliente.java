package TallerReparacionesSpringBoot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cliente;
	private String nombre;
	private String dni_cliente;
	private String telefono;
	private String email;
	
	//Constructor vacío para que lo use Hiberbnate para crear el cliente
	public Cliente() {}
	
	//Constructor para insertar un cliente
	public Cliente(String nombre, String dni_cliente, String telefono, String email) {
		super();
		this.nombre = nombre;
		this.dni_cliente = dni_cliente;
		this.telefono = telefono;
		this.email = email;
	}
	
	
	//Getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni_cliente() {
		return dni_cliente;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public void setDni_cliente(String dni_cliente) {
		this.dni_cliente = dni_cliente;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente{id_cliente=" + id_cliente + ", nombre=" + nombre + ", dni_cliente=" + dni_cliente + ", telefono=" + telefono + ", email=" + email + "}";
	}
	
	
}
