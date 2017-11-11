package modelo;

import java.awt.Point;

public class cuatroPuntos {
    
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public cuatroPuntos() {
    }

    public cuatroPuntos(int a, int b, int c, int d,int e, int f, int g, int h) {
        this.a = new Point(a,b);
        this.b = new Point(c,d);
        this.c = new Point(e,f);
        this.d = new Point(g,h);
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

    public double getDX(){
        return d.getX();
    }
    
    public double getDY(){
        return d.getY();
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
    
    public double moduloCD(){
        double powX = Math.pow((getDX() - getCX()), 2);
        double powY = Math.pow((getDY() - getCY()), 2);
        double modulo;
        
        return modulo = Math.sqrt((powX + powY));
    }
    
    public double moduloDA(){
        double powX = Math.pow((getAX() - getDX()), 2);
        double powY = Math.pow((getAY() - getDY()), 2);
        double modulo;
        
        return modulo = Math.sqrt((powX + powY));
    }
}
