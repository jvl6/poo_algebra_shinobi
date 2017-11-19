package main;

import java.util.Scanner;
import modelo.*;

/**
 *
 * @author Juan Catrileo / Sergio Herrera / Javier Vergara
 */
public class Main {

    public static void main(String[] args) {

        Ingreso_puntos ventana = new Ingreso_puntos();

        ventana.setTitle("calculo de areas y perimetros");
        ventana.setVisible(true);

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

        System.out.println(" ******************************************** ");
        System.out.println("*      CALCULADORA DE ÁREA Y PERÍMETRO       *");
        System.out.println("**********************************************");
        System.out.println("|Seleccione la cantidad de puntos a ingresar |");
        System.out.println("|siguiendo las instrucciones en pantalla.    |");
        System.out.println("|Ingrese los puntos con una coma.            |");
        System.out.println("|EJ: 3,6                                     |");
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - ");

        Scanner input = new Scanner(System.in);
        boolean exit = false;

        while (exit == false) {
            cantFiguras++;

            System.out.println("\nCantidad de puntos a ingresar: ");
            System.out.println("1. Tres.");
            System.out.println("2. Cuatro.");
            System.out.print("Opción: ");
            int opcion = 0;
            try {
                opcion = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                System.out.println("Ingrese un número.");
                continue;
            }

            if (opcion == 1) {
                System.out.println("\n======================");
                System.out.println("INGRESO DE COORDENADAS");
                System.out.println("======================");

                int aX;
                int aY;
                while (true) {
                    try {
                        System.out.print("Ingrese coordenadas para A: ");
                        String coordA = input.nextLine();
                        String[] splitA = coordA.split(",");
                        aX = Integer.parseInt(splitA[0]);
                        aY = Integer.parseInt(splitA[1]);
                        break;
                    } catch (Exception e) {
                        System.out.println("Coordenada/s inválida/s.");
                    }
                }

                int bX;
                int bY;
                while (true) {
                    try {
                        System.out.print("Ingrese coordenadas para B: ");
                        String coordB = input.nextLine();
                        String[] splitB = coordB.split(",");
                        bX = Integer.parseInt(splitB[0]);
                        bY = Integer.parseInt(splitB[1]);
                        break;
                    } catch (Exception e) {
                        System.out.println("Coordenada/s inválida/s.");
                    }
                }

                int cX;
                int cY;
                while (true) {
                    try {
                        System.out.print("Ingrese coordenadas para C: ");
                        String coordC = input.nextLine();
                        String[] splitC = coordC.split(",");
                        cX = Integer.parseInt(splitC[0]);
                        cY = Integer.parseInt(splitC[1]);
                        break;
                    } catch (Exception e) {
                        System.out.println("Coordenada/s inválida/s.");
                    }
                }

                tresPuntos triangulo = new tresPuntos(aX, aY, bX, bY, cX, cY);
                System.out.println("\nFigura ingresada: " + triangulo.getTipo());

                System.out.println("\n======================");
                System.out.println("MÓDULO DE LOS VECTORES");
                System.out.println("======================");
                System.out.println("Módulo AB: " + triangulo.moduloAB());
                System.out.println("Módulo BC: " + triangulo.moduloBC());
                System.out.println("Módulo AC: " + triangulo.moduloCA());

                System.out.println("\nÁrea: " + triangulo.getArea());

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
                System.out.println("\n======================");
                System.out.println("INGRESO DE COORDENADAS");
                System.out.println("======================");

                int aX;
                int aY;
                while (true) {
                    try {
                        System.out.print("Ingrese coordenadas para A: ");
                        String coordA = input.nextLine();
                        String[] splitA = coordA.split(",");
                        aX = Integer.parseInt(splitA[0]);
                        aY = Integer.parseInt(splitA[1]);
                        break;
                    } catch (Exception e) {
                        System.out.println("Coordenada/s inválida/s.");
                    }
                }

                int bX;
                int bY;
                while (true) {
                    try {
                        System.out.print("Ingrese coordenadas para B: ");
                        String coordB = input.nextLine();
                        String[] splitB = coordB.split(",");
                        bX = Integer.parseInt(splitB[0]);
                        bY = Integer.parseInt(splitB[1]);
                        break;
                    } catch (Exception e) {
                        System.out.println("Coordenada/s inválida/s.");
                    }
                }

                int cX;
                int cY;
                while (true) {
                    try {
                        System.out.print("Ingrese coordenadas para C: ");
                        String coordC = input.nextLine();
                        String[] splitC = coordC.split(",");
                        cX = Integer.parseInt(splitC[0]);
                        cY = Integer.parseInt(splitC[1]);
                        break;
                    } catch (Exception e) {
                        System.out.println("Coordenada/s inválida/s.");
                    }
                }

                int dX;
                int dY;
                while (true) {
                    try {
                        System.out.print("Ingrese coordenadas para D: ");
                        String coordD = input.nextLine();
                        String[] splitD = coordD.split(",");
                        dX = Integer.parseInt(splitD[0]);
                        dY = Integer.parseInt(splitD[1]);
                        break;
                    } catch (Exception e) {
                        System.out.println("Coordenada/s inválida/s.");
                    }
                }

                cuatroPuntos cuadrilatero = new cuatroPuntos(aX, aY, bX, bY, cX, cY, dX, dY);
                System.out.println("\nFigura ingresada: " + cuadrilatero.getTipo());

                c_cuadrilateros++;

                System.out.println("\n======================");
                System.out.println("MÓDULO DE LOS VECTORES");
                System.out.println("======================");
                System.out.println("Módulo AB: " + cuadrilatero.moduloAB());
                System.out.println("Módulo BC: " + cuadrilatero.moduloBC());
                System.out.println("Módulo CD: " + cuadrilatero.moduloCD());
                System.out.println("Módulo DA: " + cuadrilatero.moduloDA());

                switch (cuadrilatero.getTipo()) {
                    case "Cuadrado":
                        c_cuadrado++;
                        System.out.println("\nÁrea: " + cuadrilatero.getArea());
                        break;
                    case "Rombo":
                        c_rombo++;
                        System.out.println("\nÁrea: " + cuadrilatero.getArea());
                        break;
                    case "rectangulo":
                        c_rectangulo++;
                        System.out.println("\nÁrea: " + cuadrilatero.getArea());
                        break;
                    case "Romboide":
                        c_romboide++;
                        System.out.println("\nÁrea: " + cuadrilatero.getArea());
                        break;
                    case "Trapecio":
                        c_trapecio++;
                        Trapecio trapecio = new Trapecio(aX, aY, bX, bY, cX, cY, 
                                dX, dY);
                        System.out.println("\nPerímetro: " + 
                                trapecio.getPerimetro());
                        System.out.println("\nÁrea: " + 
                                trapecio.getArea());
                        break;
                    case "Trapezoide":
                        c_trapezoide++;
                        Trapezoide trapezoide = new Trapezoide(aX, aY, bX, bY, 
                                cX, cY, dX, dY);
                        System.out.println("\nPerímetro: " + 
                                trapezoide.getPerimetro());
                        System.out.println("\nÁrea: " + trapezoide.getArea());
                        break;
                }

                /* esta es el area del trapecio
        
        int SemiArea=0;
        int h=0;
        int bMayor=0;//cambiar por las bases correspondientes base Mayor
        int bMenor=0;//cambiar por las bases correspondientes base Menor
        int area=0;
        int lado1=0;
        int lado2=0;
        int base = 0;
        int HtMedia=0;
        int area=0;
        double Ht=0;
        System.out.println("area de trapecio");
        htMedia= (bMenor - bMayor) /2;
        ht= (Math.sqrt(htMedia);
        h= ht;
        SemiArea = ((bMayor + bMenor)/2 * (h))  ;
        area = SemiArea + (h * 2) ;
        perimetro = bMayor + bMenor + lado1 + lado2
        ========================================================================
                 */
                // area de las figuras de cuatro lados por lo menos con un lado paralelo
                /*
        int area=0;
        int lado1=0; // se reemplaza por uno de los lados
        int lado2=0;// se reemplazar por otro lado distinto
        int lado3=0;
        int lado4=0;
        System.out.println("el area es:");
        area = lado1 * lado2;
        perimetro= lado1 + lado2 + lado3 + lado4;
                 */
            }

            boolean exit2 = false;
            while (exit2 == false) {
                System.out.print("\n¿Desea continuar? (S o N): ");

                String opc = input.nextLine();
                switch (opc.toLowerCase()) {
                    case "n":
                        System.out.println("\n==================");
                        System.out.println("FIGURAS INGRESADAS");
                        System.out.println("==================");
                        System.out.println("------------------------------------------"
                                + "-");
                        System.out.println("Total Triángulos: " + c_triangulo);
                        System.out.println("Equiláteros: " + c_equilatero);
                        System.out.println("Isósceles: " + c_isosceles);
                        System.out.println("Escalenos: " + c_escaleno);
                        System.out.println("------------------------------------------"
                                + "-");

                        System.out.println("------------------------------------------"
                                + "-");
                        System.out.println("Total Cuadriláteros: " + c_cuadrilateros);
                        System.out.println("Cuadrados: " + c_cuadrado);
                        System.out.println("Rombos: " + c_rombo);
                        System.out.println("Rectángulos: " + c_rectangulo);
                        System.out.println("Romboides: " + c_romboide);
                        System.out.println("Trapecios: " + c_trapecio);
                        System.out.println("Trapezoides: " + c_trapezoide);
                        System.out.println("------------------------------------------"
                                + "-");
                        System.out.println("=========================================="
                                + "=");
                        System.out.println("Total de figuras ingresadas: "
                                + cantFiguras);
                        System.out.println("=========================================="
                                + "=");
                        exit = true;
                        exit2 = true;
                        break;
                    case "s":
                        exit2 = true;
                    default:
                        System.out.println("Ingrese [S] o [N].");
                }
            }
        }
    }
}
