package ejercicios.clase4;

/*
Clase 4
Ejercicio01
Programa que pide el ingreso de un numero
e indica si es un numero primo o no.
*/

import com.github.sanchezih.util.io.Consola;

public class Ejercicio01 {

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print(isPrime(Consola.leerEntero("Ingrese un numero: ")));
    }
}
