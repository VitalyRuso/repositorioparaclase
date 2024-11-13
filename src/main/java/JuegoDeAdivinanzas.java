package main.java;

import java.util.Scanner;

public class JuegoDeAdivinanzas {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int numeroSecreto = generarNumeroAleatorio();
		int intentosMaximos = 5;
		int intentos = 0;
		boolean adivinado = false;

		System.out.println("¡Bienvenido al juego de adivinanza!");
		System.out.println("He elegido un número entre 1 y 100. Tienes 5 intentos para adivinarlo.");

		while (intentos < intentosMaximos && !adivinado) {
			System.out.print("Intento " + (intentos + 1) + ": ¿Cuál es tu adivinanza? ");
			int numeroAdivinar = leer.nextInt();
			intentos++;

			if (numeroAdivinar < 1 || numeroAdivinar > 100) {
				System.out.println("Por favor, ingresa un número entre 1 y 100.");
				intentos--;
			} else if (numeroAdivinar < numeroSecreto) {
				System.out.println("Demasiado bajo. Intenta de nuevo.");
			} else if (numeroAdivinar > numeroSecreto) {
				System.out.println("Demasiado alto. Intenta de nuevo.");
			} else {
				adivinado = true;
				System.out.println(
						"¡Felicidades! Has adivinado el número " + numeroSecreto + " en " + intentos + " intentos.");
			}
		}

		if (!adivinado) {
			System.out.println("No has adivinado el número. El número era: " + numeroSecreto);
		}

		leer.close();
	}

	private static int generarNumeroAleatorio() {
		return (int) (Math.floor(Math.random() * 100) + 1);
	}
}
