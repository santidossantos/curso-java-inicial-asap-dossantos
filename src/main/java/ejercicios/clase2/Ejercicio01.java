package ejercicios.clase2;

/*
Ejercicio01
Programa que muestra los N primeros numeros de la serie de Fibonacci.
El valor de N se lee por teclado.
La serie de fibonacci la forman una serie de numeros tales que:
El primer termino de la serie es el numero 1.
El segundo termino de la serie es el numero 1.
Los siguientes terminos de la serie de fibonacci
se obtienen de la suma de los dos anteriores: 1, 1, 2, 3, 5, 8, 13...

 */

import ar.edu.ort.p1.util.Consola;

public class Ejercicio01 {

    public static void printFibonacci(int n) {
        int a, b, c;
        a = 0;
        b = 1;
        c = 2;

        for (int i = 1; i <= n; i++) {
            c = a + b;
            System.out.print(a + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        int n = Consola.leerEntero("Ingrese cuantos numeros se van a mostrar: ");
        printFibonacci(n);
    }
}
