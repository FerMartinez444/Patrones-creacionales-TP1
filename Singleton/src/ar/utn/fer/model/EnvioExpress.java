package ar.utn.fer.model;

public class EnvioExpress implements MetodoEnvio {
    @Override
    public void enviar(){
        System.out.println("Envío Express activado");
    }
}
