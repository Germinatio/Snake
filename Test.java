import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Test {
	public static void main(String[] args) {
		boolean play = true;
		Table t = new Table();
		Ent s = new Snake(45, 10);
		KL kl = new KL();
		while(play) {
			s.setXY();
			t.add(s, s.x, s.y);
			Ent f = new Food();
			f.setXY();
			t.add(f, f.x, f.y);
			System.out.println(t);
			t.remove(f, f.x, f.y);
			t.remove(s, s.x, s.y);
			System.out.printf("%c[%d;%df", 0x1B, 0, 0);
			try {
				Thread.sleep(1000);	//trying "moving" food every 5 sec
			}
			catch(InterruptedException ex) {}
		}
	}
}
