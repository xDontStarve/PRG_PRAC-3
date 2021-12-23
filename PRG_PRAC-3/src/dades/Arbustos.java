/**
 * @author Jialiang Chen
 * @author Jose Luis Pueyo
 */
package dades;

public class Arbustos extends Planta{
	private int absorcio, edatMaxima;
	public Arbustos(String nomCientific, int absorcio, int edatMaxima) {
		super(nomCientific, Planta.ARBUSTICA);
		this.absorcio=absorcio;
		this.edatMaxima=edatMaxima;
	}
	
	public int getAbsorcio() {
		return this.absorcio;
	}

	public int getEdatMaxima() {
		return edatMaxima;
	}

	public void setEdatMaxima(int edatMaxima) {
		this.edatMaxima = edatMaxima;
	}

	public void setAbsorcio(int absorcio) {
		this.absorcio = absorcio;
	}

	@Override
	public String toString() {
		return "Arbustos [absorcio=" + absorcio + ", edatMaxima=" + edatMaxima + "]";
	}
	
}
