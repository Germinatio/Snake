import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.KeyListener;

public class KL extends JFrame implements KeyListener {

	//CAMPI
	private final boolean debug = false;
	private boolean kPressed = false;
	private JFrame jf;
	
	//COSTRUTTORE
	public KL() {
		jf = new JFrame();
		//jf.pack(); ---> auto JFrame resize (useless if using setSize())
		jf.setSize(30,10);
		jf.setVisible(true);
		jf.addKeyListener(this);
	}
	
	//METODI
	public void keyReleased(KeyEvent e) { // when released it keeps the last direction and go on moving 
		
		switch (e.getKeyCode()) 
		{
			case KeyEvent.VK_UP:
					Snake.y--;
					if(debug){System.out.println("keyReleased UP");}
				break;
			case KeyEvent.VK_DOWN:
					Snake.y++;
					if(debug){System.out.println("keyReleased DOWN");}
				break;
			case KeyEvent.VK_LEFT:
					Snake.x--;
					if(debug){System.out.println("keyReleased LEFT");}
				break;
			case KeyEvent.VK_RIGHT:
					Snake.x++;
					if(debug){System.out.println("keyReleased RIGHT");}
				break;		
		}
	}
	
	public void keyPressed(KeyEvent e) { //when pressed changes direction, then moves
		switch (e.getKeyCode()) 
		{
			case KeyEvent.VK_UP:
				Snake.y--;
				if(debug){System.out.println("keyPressed UP");}
				kPressed = true;
				break;
			case KeyEvent.VK_DOWN:
				Snake.y++;
				if(debug){System.out.println("keyPressed DOWN");}
				kPressed = true;
				break;
			case KeyEvent.VK_LEFT:
				Snake.x--;
				if(debug){System.out.println("keyPressed LEFT");}
				kPressed = true;
				break;
			case KeyEvent.VK_RIGHT:
				Snake.x++;
				if(debug){System.out.println("keyPressed RIGHT");}
				kPressed = true;
				break;		
		}
	}
	
	public void keyTyped(KeyEvent e) {}
}
