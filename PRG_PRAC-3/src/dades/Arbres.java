package dades;

public class Arbres extends Plantes{
	private int[] absorcio, rangEdats;
	public Arbres(String nomCientific, int absorcio[], int rangEdats[]) {
		super(nomCientific, Plantes.ARBOREA);
		this.absorcio=absorcio;
		this.rangEdats=rangEdats;
	}
}