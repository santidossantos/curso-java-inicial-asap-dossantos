package ejercicios.clase1;

/*
    Programa que pide por teclado la fecha de nacimiento de una persona (dia, mes, anio)
    y calcula su numero de la suerte.
    El numero de la suerte se calcula sumando
    el dia, mes y anio de la fecha de nacimiento
    y a continuacion sumando las cifras obtenidas en la suma.
    Por ejemplo: Si la fecha de nacimiento es 12/07/1980
    Calculamos el numero de la suerte asi: 12+7+1980 = 1999 1+9+9+9 = 28
    Numero de la suerte: 28
 */

import ar.edu.ort.p1.util.Consola;

public class Ejercicio02 {

    public static int leerInput() {
        int day = Consola.leerEntero("Ingrese el dia: ");
        int month = Consola.leerEntero("Ingrese el mes: ");
        int year = Consola.leerEntero("Ingrese el ano: ");

        return (day + month + year);
    }

    public static int calcularNumeroSuerte() {
        String sumAsString = String.valueOf(leerInput());

        int luckNumberSum = 0;
        for (int i = 0; i < sumAsString.length(); i++) {
            int digit = Character.getNumericValue(sumAsString.charAt(i));
            luckNumberSum += digit;
        }

        return luckNumberSum;
    }

    public static void main(String[] args) {
        System.out.println("Numero de suerte: " + calcularNumeroSuerte());
    }

}
