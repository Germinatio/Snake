public abstract class Ent {
	/* This class describes the elements that are on the playing table
	 * Its subclasses are Food and Snake
	 */
	//CAMPI
	public int x, y;
	
	//METODI
	public abstract String toString();
		//overrided in sub-classes
	
	public void setXY() {
		if(this instanceof Snake) {
			x = Snake.x;
			y = Snake.y;
		}
		if(this instanceof Food) {
			x = Food.x;
			y = Food.y;
		}
	}
}
