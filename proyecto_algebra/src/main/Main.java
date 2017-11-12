package main;

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
        int cantFiguras = 0;
        int c_triangulo = 0;
        int c_equilatero = 0;
        int c_isosceles = 0;
        int c_escaleno = 0;

        int c_cuadrilateros = 0;
        int c_cuadrado = 0;
        int c_rombo = 0;
        int c_rectangulo = 0;
        int c_romboide = 0;
        int c_trapecio = 0;
        int c_trapezoide = 0;

        Scanner input = new Scanner(System.in);

        while (true) {
            cantFiguras++;

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

                System.out.println("Tipo: " + triangulo.getTipo());
                
                switch (triangulo.getTipo()) {
                    case "Triángulo Equilátero.":
                        c_equilatero++;
                        break;
                    case "Triángulo Isósceles.":
                        c_isosceles++;
                        break;
                    case "Triángulo Escaleno.":
                        c_escaleno++;
                        break;
                    default:
                        break;
                }
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
                
                c_cuadrilateros++;

                System.out.println("Módulo AB: " + cuadrilatero.moduloAB());
                System.out.println("Módulo BC: " + cuadrilatero.moduloBC());
                System.out.println("Módulo CD: " + cuadrilatero.moduloCD());
                System.out.println("Módulo DA: " + cuadrilatero.moduloDA());

                System.out.println("Tipo: " + cuadrilatero.getTipo());
                
                switch(cuadrilatero.getTipo()) {
                    case "Cuadrado":
                        c_cuadrado++;
                        break;
                    case "Rombo":
                        c_rombo++;
                        break;
                    case "rectangulo":
                        c_rectangulo++;
                        break;
                    case "Romboide":
                        c_romboide++;
                        break;
                    case "Trapecio":
                        c_trapecio++;
                        break;
                    case "Trapezoide":
                        c_trapezoide++;
                        break;
                }
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
            System.out.print("Desea continuar [1.si / 2.no]: ");

            int opc = Integer.parseInt(input.nextLine());

            if (opc == 2) {
                System.out.println("Figuras ingresadas:");
                System.out.println("Total: " + cantFiguras);
                System.out.println("Total Triángulos: " + c_triangulo);
                System.out.println("Equiláteros: " + c_equilatero);
                System.out.println("Isósceles: " + c_isosceles);
                System.out.println("Escalenos: " + c_escaleno + "\n");
                
                System.out.println("Total Cuadriláteros: " + c_cuadrilateros);
                System.out.println("Cuadrados: " + c_cuadrado);
                System.out.println("Rombos: " + c_rombo);
                System.out.println("Rectángulos: " + c_rectangulo);
                System.out.println("Romboides: " + c_romboide);
                System.out.println("Trapecios: " + c_trapecio);
                System.out.println("Trapezoides: " + c_trapezoide);
                break;
            }
        }
    }
}
