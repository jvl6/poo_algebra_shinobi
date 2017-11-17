package modelo;

import java.awt.Point;

public class Trapezoide {

    private Point a;
    private Point b;
    private Point c;
    private Point d;
    private String Trapecio;

    public Trapezoide() {
    }

    public Trapezoide(int a, int b, int c, int d, int e, int f, int g, int h) {
        this.a = new Point(a, b);
        this.b = new Point(c, d);
        this.c = new Point(e, f);
        this.d = new Point(g, h);
    }

    public double getAX() {
        return a.getX();
    }

    public double getAY() {
        return a.getY();
    }

    public double getBX() {
        return b.getX();
    }

    public double getBY() {
        return b.getY();
    }

    public double getCX() {
        return c.getX();
    }

    public double getCY() {
        return c.getY();
    }

    public double getDX() {
        return d.getX();
    }

    public double getDY() {
        return d.getY();
    }

    public void setArea() {

    }

    public double moduloAB() {
        return Math.sqrt(((Math.pow((getBX() - getAX()), 2))
                + (Math.pow((getBY() - getAY()), 2))));
    }

    public double moduloBC() {
        return Math.sqrt((Math.pow((getCX() - getBX()), 2))
                + (Math.pow((getCY() - getBY()), 2)));
    }

    public double moduloCD() {
        return Math.sqrt((Math.pow((getDX() - getCX()), 2))
                + (Math.pow((getDY() - getCY()), 2)));
    }

    public double moduloDA() {
        return Math.sqrt(((Math.pow((getAX() - getDX()), 2))
                + (Math.pow((getAY() - getDY()), 2))));
    }

    public double moduloCA() {
        return Math.sqrt((Math.pow((getAX() - getCX()), 2))
                + (Math.pow((getAY() - getCY()), 2)));
    }

    public double moduloBD() {
        return Math.sqrt(((Math.pow((getDX() - getBX()), 2))
                + (Math.pow((getDY() - getBY()), 2))));
    }

    /*
    int b1=0;
    int b2=0;
    int db1=0;
    int db2=0;
    int hA1=0;
    int hA2=0;
    double h1=0;
    double h2=0;
    int lado1=0;
    int lado2=0;
    int lado3=0;
    int areaT=0;
    int area1=0;
    int area2=0;
    int perimetro=0;
    System.out.println("calcular area");
    db1= b1 / 2;
    hA1= db1 - lado1;
    h1=Math.sqrt(HA);
    area1= (h1 + b1)/2
    db2= b2 / 2;
    HA2= db2 - lado2;
    h2=Math.sqrt(HA2);
    area2=(h1 + b1)/2;
    areaT= area 1 + area 2;
    perimetro= b1 + lado3 + lado1 +lado2;
    */
}