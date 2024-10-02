package main.java;

public class CambiadorDeValores {
public static void main (String[] args) {
 int ent = 5;
 int ent2 = 8;
 
 ent = ent + ent2;      
 ent2 = ent - ent2;
 ent = ent - ent2;
 
 System.out.println("Antes del intercambio");
 System.out.println("entero1 =" + ent);
 System.out.println("entero2 =" + ent2);

}
}