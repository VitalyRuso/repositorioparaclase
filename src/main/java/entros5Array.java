package main.java;

public class entros5Array {
	public static void main(String[] args) {

		int[] numeros = new int[5];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
		}
		
		for (int numero : numeros) {
			System.out.(numero);
		}
	}
}