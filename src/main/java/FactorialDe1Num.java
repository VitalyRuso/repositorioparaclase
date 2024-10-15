package main.java;

import java.util.Scanner;

public class FactorialDe1Num {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int num = leer.nextInt();
		long factorial = 1;

		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}

		System.out.println("El factorial de " + num + " es: " + factorial);
	}
}
