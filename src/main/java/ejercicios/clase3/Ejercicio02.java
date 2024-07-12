package ejercicios.clase3;

/*
Ejercicio02
Programa que pide 10 numeros por teclado,
los almacena en un array y
que luego muestra el maximo valor,
el minimo y las posiciones que ocupan en el array.

 */

import com.github.sanchezih.util.io.Consola;

public class Ejercicio02 {

    public static int calcularMaximo(int[] arreglo) {
        int maximo = arreglo[0];
        for(int i=1; i < arreglo.length; i++) {
            if(arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
        }
        return maximo;
    }

    public static int calcularMinimo(int[] arreglo) {
        int minimo = arreglo[0];
        for(int i=1; i < arreglo.length; i++) {
            if(arreglo[i] < minimo) {
                minimo = arreglo[i];
            }
        }
        return minimo;
    }

    public static int[] leerArreglo() {
        int[] numbers = new int[10];

        for(int i=0; i < numbers.length; i++) {
            numbers[i] = Consola.leerEntero("Ingrese un número: ");
        }

        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = leerArreglo();
        System.out.println("El número máximo es: " + calcularMaximo(numbers));
        System.out.println("El número mínimo es: " + calcularMinimo(numbers));
    }

}
