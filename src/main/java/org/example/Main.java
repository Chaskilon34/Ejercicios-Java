package org.example;

public class Main {
    public static void main(String[] args){

        Vehiculo[] vehiculos = {
                new Carro(),
                new Moto(),
                new Bicicleta()
        };
        for (Vehiculo vehiculo : vehiculos){
            vehiculo.arrancar();
            vehiculo.detener();
            vehiculo.combustible();
            System.out.println("__________________");
        }

        /// me falto la clase vieaje
    }
}