package ar.utn.fer.model;

public class LogisticaLibro {
    public static Libro crearLibro(String tipo, String titulo, String autor){
        if (tipo.equalsIgnoreCase("fisico")){
            return new LibroFisico(titulo, autor);
        } else if (tipo.equalsIgnoreCase("digital")){
            return new LibroDigital(titulo, autor);
        } else {
            throw new IllegalArgumentException("Tipo de libro no reconocido: " + tipo);
        }
    }
}
