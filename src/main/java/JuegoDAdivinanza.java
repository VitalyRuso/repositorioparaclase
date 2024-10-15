package main.java;

import java.util.Random;
import java.util.Scanner;

public class JuegoDAdivinanza {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Random rand = new Random();
		int numeroSecreto = rand.nextInt(100) + 1;
		int intentosMaximos = 5;
		int adivinanza;

		System.out.println("Tienes " + intentosMaximos + " intentos para adivinar el número (entre 1 y 100).");

		for (int i = 1; i <= intentosMaximos; i++) {
			System.out.print("Intento " + i + ": ");
			adivinanza = leer.nextInt();

			if (adivinanza == numeroSecreto) {
				System.out.println("¡Felicidades! Adivinaste el número en " + i + " intentos.");
				return;
			} else if (adivinanza < numeroSecreto) {
				System.out.println("El número es mayor.");
			} else {
				System.out.println("El número es menor.");
			}
		}

		System.out.println("Lo siento, se acabaron los intentos. El número era: " + numeroSecreto);
	}
}
