// Marc Fonseca
package dades;

public class LlistaRodals {
	private Rodal[] llistaRodals;
	private int numElem;
	
	public LlistaRodals(int num) {
		llistaRodals = new Rodal[num];
		numElem = 0;
	}
	
	public void afegir (Rodal rodal) {
		if (numElem < llistaRodals.length) {
			llistaRodals[numElem] = rodal;
			numElem++;
		}	
	}

	public int getNumElem() {
		return numElem;
	}

	public void setNumElem(int numElem) {
		this.numElem = numElem;
	}

	@Override
	public String toString() {
		String aux = "";
		if (numElem == 0) {
			aux = "No hi ha cap Rodal.";
		}
		else {
			for (int i = 0; i < numElem; i++) {
					aux += "\n\t\t Rodal "+ i + ": " +llistaRodals[i].toString();
			}
		}
		return aux;
	}
}
