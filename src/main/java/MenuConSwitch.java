package main.java;

import java.util.Scanner;

public class MenuConSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcion;

		do {
			// Mostrar el menú
			System.out.println("Seleccione una opción:");
			System.out.println("1. Sumar dos números");
			System.out.println("2. Restar dos números");
			System.out.println("3. Multiplicar dos números");
			System.out.println("4. Dividir dos números");
			System.out.println("5. Salir");

			// Leer la opción elegida por el usuario
			opcion = scanner.nextInt();

			// Variables para almacenar los números
			double num1, num2, resultado;

			switch (opcion) {
			case 1:
				// Sumar dos números
				System.out.print("Introduce el primer número: ");
				num1 = scanner.nextDouble();
				System.out.print("Introduce el segundo número: ");
				num2 = scanner.nextDouble();
				resultado = num1 + num2;
				System.out.println("Resultado: " + resultado);
				break;

			case 2:
				// Restar dos números
				System.out.print("Introduce el primer número: ");
				num1 = scanner.nextDouble();
				System.out.print("Introduce el segundo número: ");
				num2 = scanner.nextDouble();
				resultado = num1 - num2;
				System.out.println("Resultado: " + resultado);
				break;

			case 3:
				// Multiplicar dos números
				System.out.print("Introduce el primer número: ");
				num1 = scanner.nextDouble();
				System.out.print("Introduce el segundo número: ");
				num2 = scanner.nextDouble();
				resultado = num1 * num2;
				System.out.println("Resultado: " + resultado);
				break;

			case 4:
				// Dividir dos números
				System.out.print("Introduce el primer número: ");
				num1 = scanner.nextDouble();
				System.out.print("Introduce el segundo número: ");
				num2 = scanner.nextDouble();
				if (num2 != 0) {
					resultado = num1 / num2;
					System.out.println("Resultado: " + resultado);
				} else {
					System.out.println("Error: No se puede dividir por cero.");
				}
				break;

			case 5:
				// Salir
				System.out.println("Saliendo del programa.");
				break;

			default:
				// Opción no válida
				System.out.println("Opción no válida. Intenta de nuevo.");
			}

			System.out.println(); /

		} while (opcion != 5); 

		scanner.close();
	}
}
