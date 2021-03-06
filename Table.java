import java.util.*;

public class Table {

	/*
	 * In order to have a "squared" space 
	 * in the whole matrix, every space is
	 * made by 3 spaces
	 */
	
	//CAMPI
	private String[][] t;
	
	//COSTRUTTORE
	public Table() {
		t = new String[90][20];
		for(int x = 0; x < 90; x++) {
			for(int y = 0; y < 20; y++)
				t[x][y] = " ";
		}
	}

	//METODI
	public void add(Ent e, int x, int y) {
		t[x][y] = e.toString();
	}
	
	public void remove(Ent e, int x, int y) {
		t[x][y] = " ";
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("============================================================================================\n");
		for(int y = 0; y < 20; y++) {
			sb.append("|");
			for(int x = 0; x < 90; x++) {
				sb.append(t[x][y]);
			}
			sb.append("|\n");
		}
		sb.append("============================================================================================\n");
		return sb.toString();
	}
}
