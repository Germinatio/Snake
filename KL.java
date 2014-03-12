import java.awt.event.*;

public class KL extends KeyAdapter{
	public void KeyReleased(KeyEvent e){ // when released it keeps the last direction and go on moving 
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException ex) {}
		
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
	public void KeyPressed(KeyEvent e){ //when pressed changes direction, then moves
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
}
