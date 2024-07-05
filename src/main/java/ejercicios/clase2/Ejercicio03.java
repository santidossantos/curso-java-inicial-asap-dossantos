package ejercicios.clase2;

/*
Ejercicio03
El programa leera por teclado un numero entero positivo
y calculara la suma de sus cifras.
Por ejemplo, si se ingresa el numero 3601 el programa debera mostrar:
"La suma de sus cifras es: 10".
 */

import ar.edu.ort.p1.util.Consola;

public class Ejercicio03 {

    public static int sumaDigitos(int n) {
        String numeroString = Integer.toString(n);

        int sumaTotal = 0;
        for(int i=0; i < numeroString.length(); i++) {
            int digito = Integer.parseInt(numeroString.charAt(i) + "");
            sumaTotal += digito;
        }

        return sumaTotal;
    }

    public static void main(String[] args) {
        int n = Consola.leerEntero("Ingrese su numero: ");
        System.out.println("La suma de los digitos es: " + sumaDigitos(n));
    }

}
