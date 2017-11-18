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
    private String tipo;
    private double pendienteAB;
    private double pendienteBC;
    private double pendienteCA;

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

    public double moduloCA() {
        return Math.sqrt((Math.pow((getAX() - getCX()), 2))
                + (getAY() - getCY()));
    }

    public double getArea() {
        double s = (moduloAB() + moduloBC() + moduloCA()) / 2;
        return Math.sqrt(s * (s - moduloAB())
                * (s - moduloBC()) * (s - moduloCA()));
    }

    public String getTipo() {
        if (moduloAB() == moduloBC() && moduloBC() == moduloCA()) {
            this.tipo = "Triángulo Equilátero.";
        } else if (moduloAB() == moduloBC() || moduloBC() == moduloCA()) {
            this.tipo = "Triángulo Isósceles.";
        } else {
            this.tipo = "Triángulo Escaleno.";
        }
        return this.tipo;
    }
}
