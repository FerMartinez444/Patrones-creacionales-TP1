package ar.utn.fer.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString

public class Prestamo implements Cloneable{
    private Libro libro;
    private Usuario usuario;
    private String fechaInicio;
    private String fechaFin;

    @Override
    public Prestamo clone(){
        try{
            return(Prestamo) super.clone();
        }catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }

}
