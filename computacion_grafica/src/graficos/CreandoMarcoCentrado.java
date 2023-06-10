package graficos;
// realizado por Rodolfo Cantillna 28.197.182
import java.awt.*;
import javax.swing.*;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCentrado miMarco  = new MarcoCentrado();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);
		
		miMarco.setTitle("computacion grafica");
		
		
	}
}
class MarcoCentrado extends JFrame {
	
	public MarcoCentrado() {
		
	Toolkit miPantalla = Toolkit.getDefaultToolkit();		
	
	Dimension tamanioPantalla = miPantalla.getScreenSize();
	
	int alturaPantalla = tamanioPantalla.height;
	
	int anchoPantalla = tamanioPantalla.width;
	
	setSize(anchoPantalla/2, alturaPantalla/2 );
	
	setLocation(anchoPantalla/4, alturaPantalla/4 );
	
	Image miIcono =  miPantalla.getImage("C:/Users/Canti/eclipse-workspace/computacion_grafica/src/graficos/icono.gif");
	
	setIconImage(miIcono);
	}
}
