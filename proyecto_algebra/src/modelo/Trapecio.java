package modelo;

import java.awt.Point;

public class Trapecio {
    
    private Point a;
    private Point b;
    private Point c;
    private Point d;
    private Point e;
    private String Trapecio;
    
    public Trapecio(){
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
}
