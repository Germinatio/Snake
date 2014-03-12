public class Ent{
	/* This class describes the elements that are on the playing table
	 * Its subclasses are Food and Snake
	 */
	//CAMPI
	String Ent;
	
	//COSTRUTTORE
	public Ent(){
		if(this instanceof Food)
			Ent="&#164";
		if(this instanceof Snake)
			Ent="===";
	}
	
	//METODI
	public String toString(){
		return Ent;
	}
}
