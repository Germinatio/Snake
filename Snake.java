public class Snake extends Ent{
	/* this class extends Ent
	 * it describes the snake that moves on the table
	 */
	 
	 //CAMPI 
	final String Snake="---";
	public static int x;
	public static int y;
	
	 //COSTRUTTORE
	public Snake(){
		x = 15;
		y = 10;
	}
	
	 //METODI	 
	 public String toString(){
		return Snake;
	}
}
