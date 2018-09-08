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
            Line line=new Line();
            Point point =new Point();
             Point point2 =new Point();
              Point point3 =new Point();
               Point point4 =new Point();
            GestorES gestor =new GestorES();
            boolean desicion=true;
	           do {                
		////////////////////////////
		int opcion =Integer.parseInt(JOptionPane.showInputDialog(null,"seleccione una opcion\n"
				+ "1)crear punto\n"
				+ "2)crear linea\n"
				+ "3)crear rectangulo\n"
				+"4)crear triangulo\n"+"5)Salir"
				));
		switch (opcion) {
		case 1:
                    point.setX(gestor.solicitaInt("digite coordenda X"));
                    point.setY(gestor.solicitaInt("digite coordenda Y"));
                    gestor.mostrarMensaje("el punto1 es: "
                            + "("+point.getX()
                               +"," +point.getY()+")");
			break;
		case 2:
                     point.setX(gestor.solicitaInt("digite coordenda X"));
                    point.setY(gestor.solicitaInt("digite coordenda Y"));
                    point2.setX(gestor.solicitaInt("digite coordenda X punto2"));
                    point2.setY(gestor.solicitaInt("digite coordenda Y punto2"));
                    //////////////////////////7
                    line.setPointStart(point);
                    line.setPointEnd(point2);
                    
                    gestor.mostrarMensaje("Punto1 de partida de la linea:"+
                                line.getPointStart()+" punto2 de llegada"
                            +line.getPointEnd());
			break;
		case 3:
	
		break;
		case 4:
			 
		break;
                case 5:
                    desicion=false;
                    break;
		default:
                    gestor.mostrarMensaje("digite una opcion valida");
			break;
                } 
		}while (desicion==true);

	}//finIniciaMenu
}
