import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Test {
	public static void main(String[] args) {
		boolean play = true;
		Table t = new Table();
		Ent s = new Snake(15, 10);
		KL kl = new KL();
		JFrame jf = new JFrame();
		//jf.pack(); ---> auto JFrame resize (useless if using setSize())
		jf.setSize(30,10);
		jf.setVisible(true);
		jf.addKeyListener(kl);
		while(play) {
			s.setXY();
			t.add(s, s.x, s.y);
			Ent f = new Food();
			f.setXY();
			t.add(f, f.x, f.y);
			System.out.println(t);
			t.remove(f, f.x, f.y);
			System.out.printf("%c[%d;%df", 0x1B, 0, 0);
			try {
				Thread.sleep(500);	//trying "moving" food every 5 sec
			}
			catch(InterruptedException ex) {}
		}
	}
}
