package main.java;

import java.util.Scanner;

public class ClasificacionSegúnPuntuacion {
	public static void main(String[] args) {

		System.out.print("Introduzca un numero: ");

		Scanner leer = new Scanner(System.in);
		int promedio = leer.nextInt();
		if (promedio >= 90) {
			System.out.println("A");
		} else if (promedio >= 80) {
			System.out.println("B");
		} else if (promedio >= 70) {
			System.out.println("C");
		} else if (promedio >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}
}
