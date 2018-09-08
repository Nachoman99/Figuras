/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figures;

/**
 *import javax.swing.JOptionPane;
 * @author Jose Zamora y Esteban Barrantes
 */
import javax.swing.JOptionPane;
public class Menu {
    public double solicitaDouble(String mensaje){
	    double doub= Double.parseDouble(JOptionPane.showInputDialog(null,mensaje));
	    return doub; 
	    }
			public int solicitaInt(String msj){
		         int i= Integer.parseInt(JOptionPane.showInputDialog(msj));
		     return i;
		     }
		    public void mostrarMensaje(String mensaje) {
				JOptionPane.showMessageDialog(null, mensaje);
			}
		    public int solicitaOpcion(String opc) {
		    	int opcion;
		    	opcion=Integer.parseInt(JOptionPane.showInputDialog(opc)) ;
		    	return opcion;
		    }
		    public String imprimir(String mensaje) {
				JOptionPane.showInputDialog(mensaje);
				return mensaje;
			}
		    public String toString(String mensaje){
		    return mensaje;
		    }
}
