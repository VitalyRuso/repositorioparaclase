package main.java;

import java.util.Scanner;

public class SumaDeLosPrimerosN {
	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int a = leer.nextInt();
		int suma = 1;
		for (int N = 1; N <= a; N++) {
			suma += N;
			System.out.println(N);
		}
		System.out.println("La suma de los números del 1 hasta numero pedido es: " + suma);
	}
}
