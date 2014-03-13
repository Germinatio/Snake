public abstract class Ent {
	/* This class describes the elements that are on the playing table
	 * Its subclasses are Food and Snake
	 */
	//CAMPI
	protected int x, y;
	
	//METODI
	public abstract String toString();
		//overrided in sub-classes
	
	public void setXY(int x, int y) {
            this.x = x;
            this.y = y;
	}
}
