package pe.edu.cibertec.proyecto_dawii.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
    private String apellido;
    private String email;
    private String nombre;
    private String password;
    private int rol;
    private String username;
    private int estado;

    public Usuario(BigInteger id, String apellido, String email, String nombre, String password, int rol, String username, int estado) {
        this.id = id;
        this.apellido = apellido;
        this.email = email;
        this.nombre = nombre;
        this.password = password;
        this.rol = rol;
        this.username = username;
        this.estado = estado;
    }

    public Usuario() {
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", nombre='" + nombre + '\'' +
                ", password='" + password + '\'' +
                ", rol=" + rol +
                ", username='" + username + '\'' +
                ", estado=" + estado +
                '}';
    }
}
