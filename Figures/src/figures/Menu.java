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
            Rectangle rectangle = new Rectangle();
            Triangle triangle = new Triangle();
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
                    point2.setX(gestor.solicitaInt("digite coordenda X del punto 2"));
                    point2.setY(gestor.solicitaInt("digite coordenda Y del punto 2"));
                    //////////////////////////7
                    line.setPointStart(point);
                    line.setPointEnd(point2);
                    
                    gestor.mostrarMensaje("Punto1 de partida de la linea:"+
                                line.getPointStart()+" punto2 de llegada"
                            +line.getPointEnd());
			break;
		case 3:
                    point.setX(gestor.solicitaInt("digite coordenda X"));
                    point.setY(gestor.solicitaInt("digite coordenda Y"));
                    point2.setX(gestor.solicitaInt("digite coordenda X del punto 2"));
                    point2.setY(gestor.solicitaInt("digite coordenda Y del punto 2"));
                    point3.setX(gestor.solicitaInt("digite coordenda X del punto 3"));
                    point3.setY(gestor.solicitaInt("digite coordenda Y del punto 3"));
                    point4.setX(gestor.solicitaInt("digite coordenda X del punto 4"));
                    point4.setY(gestor.solicitaInt("digite coordenda Y del punto 4"));
                    rectangle.setPoint1(point);
                    rectangle.setPoint2(point2);
                    rectangle.setPoint3(point3);
                    rectangle.setPoint4(point4);
                    gestor.mostrarMensaje("El rectangulo tiene los siguientes puntos: " + rectangle.toString());
                  
		break;
		case 4:
                    point.setX(gestor.solicitaInt("digite coordenda X"));
                    point.setY(gestor.solicitaInt("digite coordenda Y"));
                    point2.setX(gestor.solicitaInt("digite coordenda X del punto 2"));
                    point2.setY(gestor.solicitaInt("digite coordenda Y del punto 2"));
                    point3.setX(gestor.solicitaInt("digite coordenda X del punto 3"));
                    triangle.setPoint1(point);
                    triangle.setPoint2(point2);
                    triangle.setPoint3(point3);
                    gestor.mostrarMensaje("El triangulo tiene los siguientes puntos: " + triangle.toString());
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
