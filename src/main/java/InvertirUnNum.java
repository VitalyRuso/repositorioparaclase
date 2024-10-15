package main.java;

import java.util.Scanner;

public class InvertirUnNum {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int num = leer.nextInt();
		int invertido = 0;

		while (num != 0) {
			int digito = num % 10;
			invertido = invertido * 10 + digito;
			num /= 10;
		}

		System.out.println("Número invertido: " + invertido);
	}
}
