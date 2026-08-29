package org.example;

public class Moto extends Vehiculo{

    @Override
    public void arrancar(){
        System.out.println("la moto arranca");
    }

    @Override
    public void detener(){
        System.out.println("la moto se detiene");
    }

    @Override
    public void combustible(){
        System.out.println("La moto tiene combustible");
    }
}