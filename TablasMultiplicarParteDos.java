package tablasMultiplicarParteDos;

import java.util.Scanner;

public class TablasMultiplicarParteDos {

	public static void main(String[] args) {
		// El usuario debe indicar dos números y deben generarse todas las tablas de
		// multiplicar de ese rango

		Scanner input = new Scanner(System.in);

		System.out.println(
				"Indica dos números entre 1 y 10, y te mostraremos todas las tablas de multiplicar que existen entre ambos números (ambos inclusive): ");
		int numero1 = input.nextInt();
		int numero2 = input.nextInt();
			
		if (numero1 > numero2) {
			
			int temp = numero1;
			numero1 = numero2;
			numero2 = temp;
			
		}
		
		else if (numero1 <= numero2) {
			
			while (numero1 <= numero2) {
			int i;
			for (i = 0; i < 11; i++) {

				int suma = numero1 * i;

				System.out.println(numero1 + " x " + i + " = " + suma);
			}
			numero1++;
		}

	}

}

}