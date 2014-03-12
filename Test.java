public class Test {
	public static void main(String[] args) {
		Table t = new Table();
		Ent s = new Snake(15, 10);
		Ent f = new Food();
		s.setXY();
		f.setXY();
		if(t.add(s, s.x, s.y))
			System.out.println("Snake added");
		if(t.add(f, f.x, f.y))
			System.out.println("Food added");
		System.out.println(t);
	}
}
