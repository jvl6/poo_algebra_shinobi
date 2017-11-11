package modelo;

import java.awt.Point;

/**
 *
 * @author Juan Catrileo / Sergio Herrera / Javier Vergara
 */
public class tresPuntos implements Figura {

    private Point a;
    private Point b;
    private Point c;

    public tresPuntos() {
    }

    public tresPuntos(int a, int b, int c, int d, int e, int f) {
        this.a = new Point(a, b);
        this.b = new Point(c, d);
        this.c = new Point(e, f);
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
}
