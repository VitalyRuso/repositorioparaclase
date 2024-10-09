package main.java;

public class Imprimirnumerosd1a10 {
	public static void main(String[] args) {
		int suma = 0;
		System.out.println("Numeros del 1 al 10");
		for (int i = 1; i <= 10; i++) {
			suma += i;
			System.out.println(i);
		}
		System.out.println("La suma de los números del 1 al 10 es: " + suma);
	}
}
