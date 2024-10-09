package main.java;

public class SumaDeNum1a10 {
	public static void main(String[] args) {
		int suma = 0;
		System.out.println("Numeros del 1 al 100");
		for (int i = 1; i <= 100; i++) {
			suma += i;
			System.out.println(i);
		}
		System.out.println("La suma de los números del 1 al 10 es: " + suma);
	}
}