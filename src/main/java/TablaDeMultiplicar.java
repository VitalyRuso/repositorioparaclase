package main.java;

import java.util.Scanner;

public class TablaDeMultiplicar {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int num = leer.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
	}
}
