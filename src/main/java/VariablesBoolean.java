package main.java;

public class VariablesBoolean {
public static void main(String[] args) {
	boolean a = true;
	boolean b = false;
    
	
	// Operaciones lógicas
	 boolean andResult = a && b; // AND
	 boolean orResult = a || b; // OR
	 boolean notA = !a; // NOT a
	 boolean notB = !b; // NOT b
	 
	System.out.println("a: " + a);
	System.out.println("b: " + b);
	System.out.println("Resultado de a AND b: " + andResult);
    System.out.println("Resultado de a OR b: " + orResult);
    System.out.println("Resultado de NOT a: " + notA);
    System.out.println("Resultado de NOT b: " + notB);
}
}
