package tablasMultiplicarParteDos;

import java.util.Scanner;

public class TablasMultiplicarParteDos {

	public static void main(String[] args) {
		// El usuario debe indicar dos números y deben generarse todas las tablas de
		// multiplicar de ese rango

		Scanner input = new Scanner(System.in);

		System.out.println(
				"Introduce dos números y te mostraremos todas las tablas de multiplicar que existen entre ellos (ambos inclusive): ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
			
		if (num1 > num2) {
			
			int temp = num1;
			num1 = num2;
			num2 = temp;
			
		}
		
		else if (num1 <= num2) {
			
			while (num1 <= num2) {
			int i;
			for (i = 0; i < 11; i++) {

				int suma = num1 * i;

				System.out.println(num1 + " x " + i + " = " + suma);
			}
			num1++;
		}

	}

}

}