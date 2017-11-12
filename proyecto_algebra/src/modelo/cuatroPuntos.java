package modelo;

import java.awt.Point;

public class cuatroPuntos {

    private Point a;
    private Point b;
    private Point c;
    private Point d;
    private String tipo;
    private int c_cuadrado = 0;
    private int c_rombo = 0;
    private int c_rectangulo = 0;
    private int c_romboide = 0;
    private int c_trapecio = 0;
    private int c_trapezoide = 0;

    public cuatroPuntos() {
    }

    public cuatroPuntos(int a, int b, int c, int d, int e, int f, int g, int h) {
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

    public double moduloAB() {
        return Math.sqrt(((Math.pow((getBX() - getAX()), 2))
                + (Math.pow((getBY() - getAY()), 2))));
    }

    public double moduloBC() {
        return Math.sqrt(((Math.pow((getCX() - getBX()), 2))
                + (Math.pow((getCY() - getBY()), 2))));
    }

    public double moduloCD() {
        return Math.sqrt(((Math.pow((getDX() - getCX()), 2))
                + (Math.pow((getDY() - getCY()), 2))));
    }

    public double moduloDA() {
        return Math.sqrt(((Math.pow((getAX() - getDX()), 2))
                + (Math.pow((getAY() - getDY()), 2))));
    }

    public String getTipo() {
        if (moduloAB() == moduloCD() && moduloBC() == moduloDA()) {
            if (getAX() == getCX() && getAY() == getCY()) {
                this.tipo = "Cuadrado";
                c_cuadrado += 1;
            } else {
                this.tipo = "Rombo";
                c_rombo += 1;
            }
        } else if ((moduloAB() == moduloCD()) && (moduloAB() != moduloBC()) && (moduloBC() == moduloDA())) {
            if (getAX() == getCX() && getAY() == getCY()) {
                this.tipo = "rectangulo";
                c_rectangulo += 1;
            } else {
                this.tipo = "Romboide";
                c_romboide += 1;
            }
        } else if (moduloAB() == moduloCD() && moduloBC() != moduloDA()) {
            this.tipo = "Trapecio";
            c_trapecio += 1;
        } else {
            this.tipo = "Trapezoide";
            c_trapezoide += 1;
        }

        return this.tipo;

    }
}
