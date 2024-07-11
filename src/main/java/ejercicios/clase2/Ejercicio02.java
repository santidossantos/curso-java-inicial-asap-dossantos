package ejercicios.clase2;

/*
Ejercicio02

Comprobar si dos numeros son amigos.
Dos numeros enteros positivos A y B son numeros amigos
si la suma de los divisores propios de A es igual a B
y la suma de los divisores propios de B es igual a A.
Los divisores propios de un número incluyen la unidad pero no el propio numero.
Un ejemplo de numeros amigos son los numeros 220 y 284.
Los divisores propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110.
La suma de los divisores propios de 220 da como resultado 284
Los divisores propios de 284 son 1, 2, 4, 71 y 142.
La suma de los divisores propios de 284 da como resultado 220.
Por lo tanto 220 y 284 son amigos.
 */


import com.github.sanchezih.util.io.Consola;

public class Ejercicio02 {

    public static int calcularSumaDivisoresPropios(int n) {
        int suma = 0;

        for (int i = 1; i <= n / 2; i++) { // Itero desde 1 hasta numero/2, ya que no puede haber divisores propios mayores que numero/2
            if (n % i == 0) { // Si i es divisor de numero
                suma += i; // Agrego i a la suma de divisores propios
            }
        }
        return suma;
    }

    public static boolean sonAmigos(int a, int b) {
        return ((calcularSumaDivisoresPropios(a) == b) && (calcularSumaDivisoresPropios(b) == a));
    }

    public static void main(String[] args) {
        int a = Consola.leerEntero("Ingrese a: ");
        int b = Consola.leerEntero("Ingrese b: ");
        System.out.println(sonAmigos(a, b));
    }
}
