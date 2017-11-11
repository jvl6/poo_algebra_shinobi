package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.*;

/**
 *
 * @author Juan Catrileo / Sergio Herrera / Javier Vergara
 */
public class Main {

    public static void main(String[] args) {

        
        intento ventana = new intento();
        
        ventana.setTitle("calculo de areas y perimetros");
        ventana.setVisible(true);
        
        List<Figura> figuras = new ArrayList<Figura>();

//        List<Figura> figuras = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.println("Cantidad de puntos a ingresar: ");
        System.out.println("1. Tres.");
        System.out.println("2. Cuatro.");
        System.out.print("Opción: ");
        int opcion = Integer.parseInt(input.nextLine());

        if (opcion == 1) {
            System.out.print("Ingrese coordenadas para A: ");
            String coordA = input.nextLine();
            String[] splitA = coordA.split(",");
            int aX = Integer.parseInt(splitA[0]);
            int aY = Integer.parseInt(splitA[1]);

            System.out.print("Ingrese coordenadas para B: ");
            String coordB = input.nextLine();
            String[] splitB = coordB.split(",");
            int bX = Integer.parseInt(splitB[0]);
            int bY = Integer.parseInt(splitB[1]);

            System.out.print("Ingrese coordenadas para C: ");
            String coordC = input.nextLine();
            String[] splitC = coordC.split(",");
            int cX = Integer.parseInt(splitC[0]);
            int cY = Integer.parseInt(splitC[1]);

            tresPuntos triangulo = new tresPuntos(aX, aY, bX, bY, cX, cY);

            figuras.add(triangulo);
            
            System.out.println("Módulo AB: " + triangulo.moduloAB());
            System.out.println("Módulo BC: " + triangulo.moduloBC());
            System.out.println("Módulo AC: " + triangulo.moduloAC());
        } 
        /*

        String opcion;
        Scanner scan = new Scanner(System.in);
        System.out.println("opciones de bases");
        System.out.println("ingrese su opcion");
        System.out.println("A.- AB");
        System.out.println("B.- AC");
        System.out.println("C.- BC");
        opcion = scan.nextLine();
        
        if (opcion == "A"){
            int h = 0;
            int Area = 0;
            System.out.println("ingrese la altura");
            h = scan.nextInt();
            Area = h + 0 / 2; 
            // el 0 es el metodo que falta debe ser reemplazado despues para ver cual es la base
        }
        else if (opcion == "B") {
            int h = 0;
            int Area = 0;
            System.out.println("ingrese la altura");
            h = scan.nextInt();
            Area = h + 0 / 2 ; 
            // el 0 debe ser reemplazado
        } else if (opcion == "C") {
            int h = 0;
            int Area = 0;
            System.out.println("ingrese altura");
            h = scan.nextInt();
            Area = h + 0 / 2;
            //reeplazar 0 segun la que sea la base */

    }
}
