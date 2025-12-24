package TallerReparacionesSpringBoot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_usuario;
    
    private String nombre_usuario;
    private String dni_usuario;
    private String password;
    
    @Enumerated(EnumType.STRING)  // Guarda el nombre del enum en la BD (como texto)
    private Rol rol;
    
    // Constructor vacío para Hibernate
    public Usuario() {}
    
    // Constructor para insertar
    public Usuario(String nombre_usuario, String dni_usuario, String password, Rol rol) {
        this.nombre_usuario = nombre_usuario;
        this.dni_usuario = dni_usuario;
        this.password = password;
        this.rol = rol;
    }
    
    // Getters y Setters
    public int getId_usuario() {
        return id_usuario;
    }
    
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    public String getNombre_usuario() {
        return nombre_usuario;
    }
    
    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }
    
    public String getDni_usuario() {
        return dni_usuario;
    }
    
    public void setDni_usuario(String dni_usuario) {
        this.dni_usuario = dni_usuario;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public Rol getRol() {
        return rol;
    }
    
    public void setRol(Rol rol) {
        this.rol = rol;
    }
    
    @Override
	public String toString() {
		return "Usuario{id_usuario=" + id_usuario + ", nombre_usuario=" + nombre_usuario + ", dni_usuario=" + dni_usuario + ", rol=" + rol  + "}";
	}
}
