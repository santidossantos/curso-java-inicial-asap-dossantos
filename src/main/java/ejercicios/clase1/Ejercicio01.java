package ejercicios.clase1;

import javax.swing.*;

/**
 * Programa que lee 1 numero entero por teclado e indica si es multiplo de 2 o
 * de 3.
 * 
 * 
 * @author ihsanch
 *
 */
public class Ejercicio01 {

	public static void calcularMultiplo() {
		String input = JOptionPane.showInputDialog("Ingrese el primer número");

		int number = (input != null) ? Integer.parseInt(input) : 0;

		String message = (number % 2 == 0)
				? "El numero " + number + " es multiplo de 2."
				:(number % 3 == 0)
				? "El numero " + number + " es multiplo de 3."
				: "El numero " + number + " no es multiplo de 2 ni de 3.";

		JOptionPane.showMessageDialog(null, message);
	}

	public static void main(String[] args) {
		calcularMultiplo();
	}

}
