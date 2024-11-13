package main.java;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce el numero del que quieres calcular la suma: ");
		int numero = leer.nextInt();
		System.out.println("El valor de la suma es :");
		System.out.println(calcularSumaHastaN(numero)); // Resultado esperado: 55

	}

	public static int calcularSumaHastaN(int n) {
		if (n <= 0)
			return 0;
		int suma = 0;
		for (int i = 1; i <= n; i++) {
			suma += i;
		}
		return suma;
	}

}
