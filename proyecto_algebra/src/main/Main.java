package main;

import java.util.Scanner;

/**
 *
 * Javier Vergara / Sergio Herrera / Juan Catrileo
 */
public class Main {

    public static void main(String[] args) {
               Scanner scan = new Scanner (System.in);
       double n1 ,n2 , resultado , resultado2;
        System.out.println("ingrese el numero 1:");
        n1=scan.nextDouble();
        System.out.println("ingrese el numero 2:");
        n2=scan.nextDouble();
        resultado = Math.sqrt(n1);
        resultado2 = Math.sqrt(n2);
        System.out.println("la raiz de n1 y  es:" + resultado + "el resultado de n2 es" +resultado2);

    }
    
}
