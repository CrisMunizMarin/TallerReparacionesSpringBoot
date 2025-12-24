package TallerReparacionesSpringBoot.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Reparacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_reparacion;
    
    private String descripcion;
    private LocalDate fecha_entrada;  // Usa LocalDate en vez de java.sql.Date
    private double coste_estimado;
    
    @Enumerated(EnumType.STRING)
    private Estado estado;
    
    // Relación ManyToOne: Muchas reparaciones pertenecen a un vehículo
    @ManyToOne
    @JoinColumn(name = "vehiculo_id", nullable = false)
    private Vehiculo vehiculo;
    
    // Relación ManyToOne: Muchas reparaciones pueden ser asignadas a un usuario (mecánico)
    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = true)
    private Usuario usuario;
    
    // Constructor vacío
    public Reparacion() {}
    
    // Constructor para insertar
    public Reparacion(String descripcion, LocalDate fecha_entrada, double coste_estimado, 
                      Estado estado, Vehiculo vehiculo, Usuario usuario) {
        this.descripcion = descripcion;
        this.fecha_entrada = fecha_entrada;
        this.coste_estimado = coste_estimado;
        this.estado = estado;
        this.vehiculo = vehiculo;
        this.usuario = usuario;
    }
    
    // Getters y Setters
    public int getId_reparacion() {
        return id_reparacion;
    }
    
    public void setId_reparacion(int id_reparacion) {
        this.id_reparacion = id_reparacion;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public LocalDate getFecha_entrada() {
        return fecha_entrada;
    }
    
    public void setFecha_entrada(LocalDate fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }
    
    public double getCoste_estimado() {
        return coste_estimado;
    }
    
    public void setCoste_estimado(double coste_estimado) {
        this.coste_estimado = coste_estimado;
    }
    
    public Estado getEstado() {
        return estado;
    }
    
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    @Override
   	public String toString() {
   		return "Reparacion{id_reparacion=" + id_reparacion + ", descripción=" + descripcion + ", fecha_entrada=" + fecha_entrada+ ", coste_estimado=" + coste_estimado + ", estado=" + estado +  ", vehiculo=" + vehiculo + ", usuario=" + usuario+"}";
   	}
}
