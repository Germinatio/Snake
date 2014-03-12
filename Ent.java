public class Ent{
	/* This class describes the elements that are on the playing table
	 * Its subclasses are Food and Snake
	 */
	//CAMPI
	String ent;
	public static int x, y;
	
	//COSTRUTTORE
	public Ent(){
		if(this instanceof Food)
			ent="&#164";
		if(this instanceof Snake)
			ent="===";
	}
	
	//METODI
	public String toString(){
		return ent;
	}
	
	public void setXY() {
		if(this instanceof Snake) {
			x = Snake.x;
			y = Snake.y;
		}
	}
}
