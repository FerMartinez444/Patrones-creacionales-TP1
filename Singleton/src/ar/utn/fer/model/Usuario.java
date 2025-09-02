package ar.utn.fer.model;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString

public class Usuario {
    private String nombre;
    private String apellido;
    private int edad;
    private String email;
    private String direccion;
}
