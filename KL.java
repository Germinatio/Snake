import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.KeyListener;

public class KL implements KeyListener {

	//CAMPI
	private final boolean debug = false;
	private JPanel jp;
	private JLabel l;
	private JButton b;
	
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
				break;
			case KeyEvent.VK_DOWN:
				Snake.y++;
				if(debug){System.out.println("keyPressed DOWN");}
				break;
			case KeyEvent.VK_LEFT:
				Snake.x--;
				if(debug){System.out.println("keyPressed LEFT");}
				break;
			case KeyEvent.VK_RIGHT:
				Snake.x++;
				if(debug){System.out.println("keyPressed RIGHT");}
				break;		
		}
	}
	
	public void keyTyped(KeyEvent e) {}
}
