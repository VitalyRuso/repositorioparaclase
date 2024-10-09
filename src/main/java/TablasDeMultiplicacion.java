package main.java;

import java.util.Scanner;

public class TablasDeMultiplicacion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Solicitar un número entero al usuario
		System.out.print("Introduce un número entero: ");
		int numero = scanner.nextInt();

		// Imprimir la tabla de multiplicar del número
		// Por ejemplo, si el número es 5, debe imprimir:
		// 5 x 1 = 5
		// 5 x 2 = 10
		// ...
		// 5 x 10 = 50
		for (int i = 1; i <= 10; i++) {
			int resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
		}

		// Cerrar el escáner
		scanner.close();
	}
}
