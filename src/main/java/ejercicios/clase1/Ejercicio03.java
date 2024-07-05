package ejercicios.clase1;

/*
Ejercicio03
El programa lee por teclado una calificacion numerica entre 0 y 10
y muestra por pantalla su correspondiente calificacion alfabetica.

La equivalencia entre la calificacion numerica y la alfabetica se muestra en esta tabla:

0 <= nota < 5 Insuficiente
5 <= nota < 6 Suficiente
6 <= nota < 7 Bien
7 <= nota < 9 Notable
9 <= nota <= 10 Sobresaliente

La calificacion numerica que se introduce por teclado debe estar comprendida entre 0 y 10
para poder obtener su equivalente calificacion alfabetica.
Si la calificacion introducida no es valida se muestra un mensaje indicandolo
y el programa finaliza.
 */

import ar.edu.ort.p1.util.Consola;

public class Ejercicio03 {

  public static boolean isBetween(int x, int lower, int upper) {
        return lower <= x && x <= upper;
    }

    public static void main(String[] args) {
        boolean noFinalizo = true;

        while (noFinalizo) {
            int calificacion = Consola.leerEntero("Ingrese su calificacion:");
            if (isBetween(calificacion, 0, 4)) {
                System.out.println("Insuficiente");
            } else if (calificacion == 5) {
                System.out.println("Insuficiente");
            } else if (calificacion == 6) {
                System.out.println("Bien");
            } else if (isBetween(calificacion, 7, 8)) {
                System.out.println("Notable");
            } else if (isBetween(calificacion, 9, 10)) {
                System.out.println("Sobresaliente");
            }
            char pregunta = Consola.leerCaracter("Quiere continuar? S/N");
            if(pregunta == 'N') {
                noFinalizo = false;
            }
        }
        System.out.println("Gracias vuelva pronto");
    }

}
