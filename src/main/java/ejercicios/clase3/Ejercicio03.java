package ejercicios.clase3;

/*
Ejercicio03
Programa que pide 5 numeros enteros,
los almacena en un array,
e indica por pantalla si dicho array es capicua.
 */

public class Ejercicio03 {

    public static boolean isCapicua(int[] arreglo) {
        int i = 0;
        int j = arreglo.length - 1;

        while (i < arreglo.length) {
            if (arreglo[i] != arreglo[j]) {
                return false;
            }
            i++; j--;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 2, 1};
        System.out.println(isCapicua(array));
    }

}
