package ejercicios.clase3;

/*
Ejercicio01
Programa que lee la altura de N personas y calcula:
1. La altura media.
2. Cuantas personas tienen una altura superior a la media.
3. Cuantas tienen una altura inferior a la media.
El valor de N se pide por teclado y debe ser entero positivo.
 */

import com.github.sanchezih.util.io.Consola;
import java.util.Arrays;


public class Ejercicio03 {

    public static double averageHeight(double[] heights) {
        return Arrays.stream(heights).average().orElse(0);
    }

    public static int howManyOverAverageHeight(double[] heights, double averageHeight) {
        return (int) Arrays.stream(heights).filter(x -> (x > averageHeight)).count();
    }

    public static int howManyUnderAverageHeight(double[] heights, double averageHeight) {
        return (int) Arrays.stream(heights).filter(x -> (x < averageHeight)).count();
    }

    public static void main(String[] args) {

        int n = Consola.leerEntero("Ingrese N: ");
        double[] heights = new double[n];

        for(int i=0; i < n; i++) {
            heights[i] = Consola.leerDouble("Ingrese una altura: ");
        }

        double averageHeight = averageHeight(heights);

        System.out.println("\nLa altura promedio es: " + averageHeight);

        System.out.println("Cantidad de personas por encima de la media: "
                + howManyOverAverageHeight(heights, averageHeight));

        System.out.println("Cantidad de personas por debajo de la media: "
                + howManyUnderAverageHeight(heights, averageHeight));

    }
}
