package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Cliente cliente = new Cliente();
        Producto producto1 = new Producto();
        Venta venta = new Venta();

        System.out.print("Indique su nombre: ");
        String user = scan.next();

        System.out.print("Nombre del producto: ");
        String producto = scan.next();

        System.out.print("Precio del producto: ");
        int precio = scan.nextInt();

        System.out.print("Indique la cantidad de objetos a pagar: ");
        int cantidad = scan.nextInt();

        cliente.user = user;
        producto1.nombre = producto;
        producto1.precio = precio;

        int total = venta.calcularT(producto1.precio, cantidad);

        System.out.println("Cliente: " + cliente.user);
        System.out.println("Producto: " + producto1.nombre);
        System.out.println("Precio: $" + producto1.precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total a pagar: " + total);

        scan.close();
    }
}