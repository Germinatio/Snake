public class Test {
	public static void main(String[] args) {
		Table t = new Table();
		Ent s = new Snake();
		s.setXY();
		t.add(s, s.x, s.y);
		System.out.println(t);
	}
}
