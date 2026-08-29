package org.example;

public class Carro extends Vehiculo {

    @Override
    public void arrancar(){
        System.out.println("el carro arranca");
    }

    @Override
    public void detener(){
        System.out.println("El carro frena");
    }

    @Override
    public void combustible(){
        System.out.println("El carro tiene conbustible");
    }
}