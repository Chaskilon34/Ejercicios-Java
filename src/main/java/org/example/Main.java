package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
/// se crea el array
        Libro[] libros = new Libro[5];

/// Ingresar  datos sobre los libros
        for (int i = 0; i < libros.length; i++) {

            System.out.println("Libro " + (i + 1));

            System.out.print("Ingrese el titulo: ");
            String titulo = sc.nextLine();

            System.out.print("Ingrese el autor: ");
            String autor = sc.nextLine();

            System.out.print("Ingrese el año de publicacion: ");
            int anio = sc.nextInt();

            sc.nextLine();

/// por aca crea el obgeto usando el contructor
            libros[i] = new Libro(titulo, autor, anio);
        }

        System.out.println("\n--- LIBROS ---");

      for (int i = 0; i < libros.length; i++) {
            libros[i].mostrarInformacion();
            System.out.println();
        }
///Busca el libro por us tituli
      System.out.print("Ingrese el titulo del libro que desea buscar: ");
        String tituloBuscar = sc.nextLine();

      boolean encontrado = false;

        for (int i = 0; i < libros.length; i++) {

            if (libros[i].getTitulo().equalsIgnoreCase(tituloBuscar)) {
             System.out.println("\nLibro encontrado:");
             libros[i].mostrarInformacion();
             encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("El libro no existe.");
        }

 ///aca busca el libro mas antiguo
        Libro libroAntiguo = libros[0];

        for (int i = 1; i < libros.length; i++) {

            if (libros[i].getAnioPublicacion()
                    < libroAntiguo.getAnioPublicacion()) {

            libroAntiguo = libros[i];
            }
        }


        System.out.println("\n LIBRO MAS ANTIGUO-----");

        libroAntiguo.mostrarInformacion();
        sc.close();
    }
}

