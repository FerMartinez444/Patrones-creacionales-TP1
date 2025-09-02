package ar.utn.fer.model;

public class EnvioNormal implements MetodoEnvio {
    @Override
    public void enviar(){
        System.out.println("Envío Normal activado");
    }
}
