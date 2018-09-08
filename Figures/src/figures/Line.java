/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figures;

/**
 * Clase para la linea con dos puntos
 * @author Jose Zamora y Esteban Barrantes
 * @ version
 */
public class Line {
   private Point pointStart; 
   private Point pointEnd;

    public Line() {
    }

    public Line(Point pointStart, Point pointEnd) {
        this.pointStart = pointStart;
        this.pointEnd = pointEnd;
    }

    public Point getPointStart() {
        return pointStart;
    }

    public void setPointStart(Point pointStart) {
        this.pointStart = pointStart;
    }

    public Point getPointEnd() {
        return pointEnd;
    }

    public void setPointEnd(Point pointEnd) {
        this.pointEnd = pointEnd;
    }

    @Override
    public String toString() {
        return "Punto 1= (" + pointStart + "), Punto 2= (" + pointEnd+")";
    }
   
   
}
