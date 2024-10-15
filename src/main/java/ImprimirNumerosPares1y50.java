package main.java;

import java.util.Scanner;

public class ImprimirNumerosPares1y50 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int b = 0;
		for (int N = 2; N <= 50; N += 2) {
			b += N;
			System.out.println(N);
		}
	}

}
