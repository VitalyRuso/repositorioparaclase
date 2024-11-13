package main.java;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println(evaluarNumero(-5)); // "El número es negativo"
		System.out.println(evaluarNumero(0)); // "El número es cero"
		System.out.println(evaluarNumero(8)); // "El número es positivo y par"
		System.out.println(evaluarNumero(15)); // "El número es positivo e impar"
	}

	public static String evaluarNumero(int n) {
		if (n > 0) {
			if (n % 2 == 0) {
				return "El número es positivo y par";
			} else {
				return "El número es positivo e impar";
			}
		} else if (n < 0) {
			return "El número es negativo";
		} else {
			return "El número es cero";
		}
	}
}
