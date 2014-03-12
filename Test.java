public class Test {
	public static void main(String[] args) {
		Table t = new Table();
		Ent s = new Snake(15, 10);
		s.setXY();
		t.add(s, s.x, s.y);
		while(true) {
			Ent f = new Food();
			f.setXY();
			t.add(f, f.x, f.y);
			System.out.println(t);
			try {
				Thread.sleep(5000);	//trying "moving" food every 5 sec
			}
			catch(InterruptedException ex) {}
			t.remove(f, f.x, f.y);
			System.out.printf("%c[%d;%df", 0x1B, 0, 0);
		}
	}
}
