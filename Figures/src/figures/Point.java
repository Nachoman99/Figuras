/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figures;

/**
 * Clase para realizar un solo punto con coordenadas X y Y
 *@author Jose Zamora y Esteban Barrantes
 * @ version
 */
public class Point {
    private int X;
    private int Y;

    public Point( ) {
    }
    public Point(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    @Override
    public String toString() {
        return "("+ X +","+Y+")";
    }
    
    
}
