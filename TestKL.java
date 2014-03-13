import javax.swing.*;

public class TestKL {
	public static void main(String[] args) {
		KL kl = new KL();
		JFrame jf = new JFrame();
		jf.setSize(30,10);
		jf.setVisible(true);
		jf.addKeyListener(kl);
	}
}
