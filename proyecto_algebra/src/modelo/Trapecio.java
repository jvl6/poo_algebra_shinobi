package modelo;

import java.awt.Point;

public class Trapecio {

    private Point a;
    private Point b;
    private Point c;
    private Point d;
    private String Trapecio;

    public Trapecio() {
    }

    public Trapecio(int a, int b, int c, int d, int e, int f, int g, int h) {
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
    
    public double moduloBD() {
        return Math.sqrt((Math.pow((getDX() - getBX()), 2)) 
                + (Math.pow((getDY() - getBY()), 2)));
    }
    
    public double moduloDC() {
        return Math.sqrt((Math.pow((getCX() - getDX()), 2)) 
                + (Math.pow((getCY() - getDY()), 2)));
    }
    
    public double moduloCA() {
        return Math.sqrt((Math.pow((getAX() - getCX()), 2)) 
                + (Math.pow((getAY() - getCY()), 2)));
    }

    public double moduloDA() {
        return Math.sqrt(((Math.pow((getAX() - getDX()), 2))
                + (Math.pow((getAY() - getDY()), 2))));
    }

    public double moduloBC() {
        return Math.sqrt(((Math.pow((getCX() - getBX()), 2))
                + (Math.pow((getCY() - getBY()), 2))));
    }
}
