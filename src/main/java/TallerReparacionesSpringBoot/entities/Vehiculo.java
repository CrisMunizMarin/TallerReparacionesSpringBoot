package TallerReparacionesSpringBoot.entities;

import jakarta.persistence.*;

@Entity
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_vehiculo;
    
    private String matricula;
    private String marca;
    private String modelo;
    
    // Relación ManyToOne: Muchos vehículos pueden pertenecer a un cliente
    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;
    
    // Constructor vacío
    public Vehiculo() {}
    
    // Constructor para insertar
    public Vehiculo(String matricula, String marca, String modelo, Cliente cliente) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.cliente = cliente;
    }
    
    // Getters y Setters
    public int getId_vehiculo() {
        return id_vehiculo;
    }
    
    public void setId_vehiculo(int id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    @Override
	public String toString() {
		return "Vehiculo{id_vehiculo=" + id_vehiculo + ", matricula=" + matricula + ", marca=" + marca+ ", modelo=" + modelo + ", cliente=" + cliente + "}";
	}
}
