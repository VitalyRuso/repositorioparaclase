package main.java;

public class CalcularPrecioFinalIVA {
public static void main(String[] args) {
	double precio = 260;
	double procentaje = 21;
	
	double sumadeprocentaje = (procentaje * precio) / 100;
	
	System.out.println("El procentaje de 260 es : " + sumadeprocentaje);
	
}
}
