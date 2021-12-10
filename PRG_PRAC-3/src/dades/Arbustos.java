package dades;

public class Arbustos extends Plantes{
	private int absorcio, edatMaxima;
	public Arbustos(String nomCientific, int absorcio, int edatMaxima) {
		super(nomCientific, Plantes.ARBUSTICA);
		this.absorcio=absorcio;
		this.edatMaxima=edatMaxima;
	}
	
	public int getAbsorcio() {
		return this.absorcio;
	}
}
