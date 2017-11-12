package modelo;

import java.awt.Point;

/**
 *
 * @author Juan Catrileo / Sergio Herrera / Javier Vergara
 */
public class tresPuntos {

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
        return Math.sqrt(((Math.pow((getBX() - getAX()), 2))
                + (Math.pow((getBY() - getAY()), 2))));
    }

    public double moduloBC() {
        return Math.sqrt(((Math.pow((getCX() - getBX()), 2))
                + (Math.pow((getCY() - getBY()), 2))));
    }

    public double moduloAC() {
        return Math.sqrt(((Math.pow((getCX() - getAX()), 2))
                + (Math.pow((getCY() - getAY()), 2))));
    }
    
    public double getArea(int opcion, double h) {
        double modulo = 0;
        
        if (opcion == 1) {
            modulo = moduloAB();
        } else if (opcion == 2){
            modulo = moduloBC();
        } else if (opcion == 3) {
            modulo = moduloAC();
        }
        
        return h + modulo / 2;
    }
}
