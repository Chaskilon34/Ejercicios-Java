package org.example;

import org.example.Division;
import org.example.Multiplicacion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Indique le primer numero :");
        int num1 = sc.nextInt();

        System.out.println("Indique el segundo numero:");
        int num2 = sc.nextInt();

        System.out.println("Iindique el tercer numero :");
        int num3 = sc.nextInt();
        int suma = num1 + num2 + num3;

        Division divison = new Division( ) ;
        int resultadoD = divison.divisioon(num1, num2, num3);
        System.out.println("Division: " + resultadoD);

        Multiplicacion multiplicacion = new Multiplicacion();
        int resultadoM = multiplicacion.multiplicacioon(num1, num2, num3);
        System.out.println("MUltiplicaclion " + resultadoM);



        double promedio = suma / 3.0;

        int mayor;

        if (num1 > num2 && num1 > num3) {
            mayor = num1;
        } else if (num2 > num1 && num2 > num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println("Número mayor: " + mayor);

        sc.close();
    }
}