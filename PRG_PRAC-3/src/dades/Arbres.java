/**
 * Autor: Jialiang Chen, Jose Luis Pueyo
*/
package dades;

import java.util.Arrays;

public class Arbres extends Plantes{
	private int[] absorcio, rangEdats;
	public Arbres(String nomCientific, int absorcio[], int rangEdats[]) {
		super(nomCientific, Plantes.ARBOREA);
		this.absorcio=absorcio;
		this.rangEdats=rangEdats;
	}
	
	
	
	public int[] getAbsorcio() {
		return absorcio;
	}

	public void setAbsorcio(int[] absorcio) {
		this.absorcio = absorcio;
	}

	public int[] getRangEdats() {
		return rangEdats;
	}

	public void setRangEdats(int[] rangEdats) {
		this.rangEdats = rangEdats;
	}

	@Override
	public String toString() {
		return "Arbres [absorcio=" + Arrays.toString(absorcio) + ", rangEdats=" + Arrays.toString(rangEdats) + "]";
	}
	
}
