package main.java;

public class Ejercicio1Arrays {
	public static void main(String[] args) {

		int[] numeros = new int[10];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
		}

		for (int numero : numeros) {
			System.out.println(numero);
		}
	}
}