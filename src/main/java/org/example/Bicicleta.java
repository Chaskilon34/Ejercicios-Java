package org.example;

public class Bicicleta extends Vehiculo{

    @Override
    public void arrancar(){
        System.out.println("la bicicleta empieza a andar");
    }

    @Override
    public void detener(){
        System.out.println("la bicicleta se detiene");
    }

    @Override
    public void combustible(){
        System.out.println("en la Bici a un sujeto pedaleando");
    }
}