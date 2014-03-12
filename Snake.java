public class Snake extends Ent {
	/* this class extends Ent
	 * it describes the snake that moves on the table
	 */
	 
	//CAMPI 
	final String snake = " S ";
	public static int x, y;
	
	//COSTRUTTORE
	public Snake(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//METODI	 
	public String toString() {
		return snake;
	}
}
