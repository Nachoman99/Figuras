/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figures;
import javax.swing.JOptionPane;
/**
 *import javax.swing.JOptionPane;
 * @author Jose Zamora y Esteban Barrantes
 */
import javax.swing.JOptionPane;
public class Menu {
   	public void iniciaMenu() {
	
		Point point =new Point();
		GestorES gestor =new GestorES();
		//arriba ewstan los atributos//////////////////////////
		int opcion =Integer.parseInt(JOptionPane.showInputDialog(null,"seleccione una opcion\n"
				+ "1)crear punto\n"
				+ "2)crear linea\n"
				+ "3)crear rectangulo\n"
				+"4)crear triangulo"
				));
		int num1,num2;
		double decimal1,decimal2;
		switch (opcion) {
		case 1:
			point.setX(gestor.solicitaInt("digite coordenda X"));
			point.setY(gestor.solicitaInt("digite coordenda Y"));
			
			break;
		case 2:
			
			break;
		case 3:
	
		break;
		case 4:
			 
		break;		
		default:
			break;
		}

	}//finIniciaMenu
}
