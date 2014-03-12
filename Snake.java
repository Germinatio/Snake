public class Snake extends Ent{
	/* this class extends Ent
	 * it describes the snake that moves on the table
	 */
	 
	 //CAMPI 
	final String snake=" S ";
	public static int x, y;
	
	 //COSTRUTTORE
	public Snake() {
		x = 15;
		y = 10;
	}
	
	 //METODI	 
	 public String toString(){
		return snake;
	}
}
