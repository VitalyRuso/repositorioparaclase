package main.java;

public class RotacionDeArray {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };

		// Almacenar el último elemento
		int ultimo = array[array.length - 1];

		// Mover todos los elementos derecha
		for (int i = array.length - 1; i > 0; i--) {
			array[i] = array[i - 1];
		}

		// Colocar el último a la primera posición
		array[0] = ultimo;
		for (int num : array) {
			System.out.print(num + " ");
		}
	}
}
