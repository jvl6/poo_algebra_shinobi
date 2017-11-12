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

//        Ingreso_puntos ventana = new Ingreso_puntos();
//        
//        ventana.setTitle("calculo de areas y perimetros");
//        ventana.setVisible(true);
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
            
            System.out.println("Módulo AB: " + triangulo.moduloAB());
            System.out.println("Módulo BC: " + triangulo.moduloBC());
            System.out.println("Módulo AC: " + triangulo.moduloAC());
            
            System.out.println("Tipo: " + triangulo.getTipo());

            System.out.println("Seleccione la base: ");
            System.out.println("1. AB");
            System.out.println("2. BC");
            System.out.println("3. AC");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(input.nextLine());

            System.out.print("Ingrese la altura: ");
            String altura = input.nextLine().replaceAll(",", ".");
            double h = Double.parseDouble(altura);

            System.out.println("Área: " + triangulo.getArea(opcion, h));
        }

        if (opcion == 2) {
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

            System.out.print("Ingrese coordenadas para D: ");
            String coordD = input.nextLine();
            String[] splitD = coordD.split(",");
            int dX = Integer.parseInt(splitD[0]);
            int dY = Integer.parseInt(splitD[1]);

            cuatroPuntos cuadrilatero = new cuatroPuntos(aX, aY, bX, bY, cX, cY, dX, dY);

            System.out.println("Módulo AB: " + cuadrilatero.moduloAB());
            System.out.println("Módulo BC: " + cuadrilatero.moduloBC());
            System.out.println("Módulo CD: " + cuadrilatero.moduloCD());
            System.out.println("Módulo DA: " + cuadrilatero.moduloDA());
                    /* esta es el area del trapesoide
        
        int SemiArea=0;
        int h=0;// usuario define altura
        int bMayor=0;//cambiar por las bases correspondientes base Mayor
        int bMenor=0;//cambiar por las bases correspondientes base Menor
        int area=0;
        System.out.println("area de trapecio");
        SemiArea = ((bMayor + bMenor)/2 * (h))  ;
        area = SemiArea + (h * 2) ;
        System.out.println("el area es:" + area);
        ========================================================================
            */
        
        // area de las figuras de cuatro lados por lo menos con un lado paralelo
        /*
        int area=0;
        int lado1=0; // se reemplaza por uno de los lados
        int lado2=0;// se reemplazar por otro lado distinto
        System.out.println("el area es:");
        area = lado1 * lado2;
        */

        }
    }
}
