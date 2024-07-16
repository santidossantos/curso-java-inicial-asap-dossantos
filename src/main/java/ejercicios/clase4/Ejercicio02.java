package ejercicios.clase4;

/*
Programa que genera un array de 8 enteros aleatorios entre 1 y 10,
lo ordena utilizando el algoritmo de ordenamiento de burbuja y lo muestra.
 */

import java.util.Arrays;
import java.util.Random;

public class Ejercicio02 {

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10) + 1;
        }
        return arr;
    }

    public static int[] bubleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int[] orderedArr = bubleSort(arr);

        Arrays.stream(orderedArr).forEach(System.out::println);
    }

}
