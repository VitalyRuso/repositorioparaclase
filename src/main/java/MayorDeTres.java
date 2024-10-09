package main.java;

import java.util.Scanner;

public class MayorDeTres {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingresa el primer número: ");
		double num1 = scanner.nextDouble();

		System.out.print("Ingresa el segundo número: ");
		double num2 = scanner.nextDouble();

		System.out.print("Ingresa el tercer número: ");
		double num3 = scanner.nextDouble();

		double mayor = num1;

		if (num2 > mayor) {
			mayor = num2;
		}
		if (num3 > mayor) {
			mayor = num3;
		}

		System.out.println("El mayor de los tres números es: " + mayor);

		scanner.close();
	}
}
