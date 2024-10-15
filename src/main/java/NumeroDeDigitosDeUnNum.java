package main.java;

import java.util.Scanner;

public class NumeroDeDigitosDeUnNum {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int num = leer.nextInt();
		int digitos = 0;

		while (num != 0) {
			num /= 10;
			digitos++;
		}

		System.out.println("El número tiene " + digitos + " dígitos.");
	}
}