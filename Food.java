import java.util.*;

public class Food extends Ent{
	/* this class extends Ent
	 * it describes the food that sometimes appears on the table
	 * One instance of this class has to be always on the table
	 * It increments Snake length of one symbol when it's reached
	 */
	 
	 //CAMPI 
	final String food=" # ";
	public static int x, y;
	private Random r = new Random();
	
	 //COSTRUTTORE
	public Food() {
		x = r.nextInt(29);
		y = r.nextInt(19);
	}
	
	 //METODI	 
	 public String toString(){
		return food;
	}
}
