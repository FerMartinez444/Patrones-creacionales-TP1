package ar.utn.fer.app;

import ar.utn.fer.db.*;
import ar.utn.fer.model.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hola soy un nuevo proyecto");

        //Parte 1

        Database db1 = Database.INSTANCE;
        Database db2 = Database.INSTANCE;

        db1.addLibro("El Principito");
        db2.addLibro("El Quijote");

        System.out.println("¿db1 y db2 son el mismo objeto? " + (db1 == db2));
        System.out.println("Libros en la DB: " + db1.listarLibros());

        //Parte 2

        Libro libro1 = LogisticaLibro.crearLibro("fisico", "El Diario de Greg", "Jef Kinney");
        Libro libro2 = LogisticaLibro.crearLibro("digital", "It", "Stephen King");

        libro1.mostrarInfo();
        libro2.mostrarInfo();

        //Parte 3

        AbstractFactory adminFactory = new AdminFactory();
        AbstractFactory userFactory = new Usuarioactory();

        InterfazUI uiAdmin = adminFactory.crearUI();
        MetodoEnvio envioAdmin = adminFactory.crearEnvio();

        InterfazUI uiUser = userFactory.crearUI();
        MetodoEnvio envioUser = userFactory.crearEnvio();

        uiAdmin.mostrarPantalla();
        envioAdmin.enviar();

        uiUser.mostrarPantalla();
        envioUser.enviar();

        //Parte 4

        Usuario usuario1 = Usuario.builder()
                .nombre("Fer")
                .apellido("Martinez")
                .edad(21)
                .email("fer.martinez.utn@gmail.com")
                .direccion("Maipu, Mendoza")
                .build();

        Usuario usuario2 = Usuario.builder()
                .nombre("Francisco")
                .apellido("Acosta")
                .edad(20)
                .email("fran.acosta@gmail.com")
                .direccion("Guaymallén, Mendoza")
                .build();

        System.out.println(usuario1);
        System.out.println(usuario2);

        //Parte 5

        Libro libro = LogisticaLibro.crearLibro("fisico", "Los Juegos del Hambre", "Suzanne Collins");
        Prestamo prestamoOriginal = Prestamo.builder()
                .libro(libro)
                .usuario(usuario1)
                .fechaInicio("01/09/2025")
                .fechaFin("10/09/2025")
                .build();

        Prestamo prestamo1 = prestamoOriginal.clone();
        Prestamo prestamo2 = prestamoOriginal.clone();

        prestamo1 = Prestamo.builder()
                .libro(prestamo1.getLibro())
                .usuario(prestamo1.getUsuario())
                .fechaInicio("02/09/2025")
                .fechaFin("12/09/2025")
                .build();

        prestamo2 = Prestamo.builder()
                .libro(prestamo2.getLibro())
                .usuario(prestamo2.getUsuario())
                .fechaInicio("03/09/2025")
                .fechaFin("13/09/2025")
                .build();

        System.out.println("Original: " + prestamoOriginal);
        System.out.println("Clon 1: " + prestamo1);
        System.out.println("Clon 2: " + prestamo2);
    }
}
