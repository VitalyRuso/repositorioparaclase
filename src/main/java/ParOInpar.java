package main.java;

import java.util.Scanner;

public class ParOInpar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce numero par: ");
		int numero = scanner.nextInt();

		if (numero % 2 == 0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es inpar");
		}
		scanner.close();
	}

}
