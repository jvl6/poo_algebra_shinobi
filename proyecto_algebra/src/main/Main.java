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
        List<Figura> figuras = new ArrayList<Figura>();
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

            tresPuntos tri = new tresPuntos(aX, aY, bX, bY, cX, cY);

            figuras.add(tri);
        }
    }
}
