/**
 * @author Jialiang Chen
 * @author Jose Luis Pueyo
 */
package dades;

public class Arbustos extends Planta{
	private int absorcio, edatMaxima, edatActual;
	public Arbustos(String nomCientific, int absorcio, int edatActual, int edatMaxima) {
		super(nomCientific, Planta.ARBUSTICA);
		this.absorcio=absorcio;
		this.edatMaxima=edatMaxima;
		this.edatActual=edatActual;
	}
	
	public int getAbsorcio() {
		if (edatActual>5 && edatActual<edatMaxima) return absorcio;
		return -1;			//-1: casos en els que no arriba a 5 anys o superen l'edat màxima (TAD??)
	}

	public int getEdatMaxima() {
		return edatMaxima;
	}
	
	public int getEdatActual() {
		return edatActual;
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
