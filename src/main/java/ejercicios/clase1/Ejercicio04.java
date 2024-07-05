package ejercicios.clase1;

/*
Ejercicio04
Programa que comprueba si un anio es bisiesto.
Un anio es bisiesto si es divisible por 4 y no lo es por 100
o si es divisible por 400.
 */

import ar.edu.ort.p1.util.Consola;

public class Ejercicio04 {

    public static boolean isBisiesto(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void main(String[] args) {
        int year = Consola.leerEntero("Ingrese al año: ");
        System.out.println(isBisiesto(year));
    }

}
