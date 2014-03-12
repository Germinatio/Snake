import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class KL extends JPanel implements KeyListener {

	//CAMPI
	private JPanel jp;
	private JLabel l;
	private JButton b;
	
	//COSTRUTTORI
	public KL() {
		jp = new JPanel();
		l = new JLabel();
		b = new JButton();
		b.addKeyListener(this);
		jp.add(b);
	}
	
	//METODI
	public void keyReleased(KeyEvent e) { // when released it keeps the last direction and go on moving 
		
		switch (e.getKeyCode()) 
		{
			case KeyEvent.VK_UP:
				try {
					Thread.sleep(500);
				}
				catch(InterruptedException ex) {}
				Snake.y--;
				break;
			case KeyEvent.VK_DOWN:
				try {
					Thread.sleep(500);
				}
				catch(InterruptedException ex) {}
				Snake.y++;
				break;
			case KeyEvent.VK_LEFT:
				try {
					Thread.sleep(500);
				}
				catch(InterruptedException ex) {}
				Snake.x--;
				break;
			case KeyEvent.VK_RIGHT:
				try {
					Thread.sleep(500);
				}
				catch(InterruptedException ex) {}
				Snake.x++;
				break;		
		}
	}
	
	public void keyPressed(KeyEvent e) { //when pressed changes direction, then moves
		switch (e.getKeyCode()) 
		{
			case KeyEvent.VK_UP:
				Snake.y--;
				break;
			case KeyEvent.VK_DOWN:
				Snake.y++;
				break;
			case KeyEvent.VK_LEFT:
				Snake.x--;
				break;
			case KeyEvent.VK_RIGHT:
				Snake.x++;
				break;		
		}
	}
	
	public void keyTyped(KeyEvent e) {}
}
