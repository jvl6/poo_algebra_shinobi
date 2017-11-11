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

    public double moduloAB() {
        double powX = Math.pow((getBX() - getAX()), 2);
        double powY = Math.pow((getBY() - getAY()), 2);
        double modulo;

        return modulo = Math.sqrt((powX + powY));
    }

    public double moduloBC() {
        double powX = Math.pow((getCX() - getBX()), 2);
        double powY = Math.pow((getCY() - getBY()), 2);
        double modulo;

        return modulo = Math.sqrt((powX + powY));
    }

    public double moduloAC() {
        double powX = Math.pow((getCX() - getAX()), 2);
        double powY = Math.pow((getCY() - getAY()), 2);
        double modulo;

        return modulo = Math.sqrt((powX + powY));
    }
}
