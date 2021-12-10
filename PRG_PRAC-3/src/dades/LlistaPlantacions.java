// Marc Fonseca
package dades;

public class LlistaPlantacions {
	private Plantacions[] llista;
	private int numElem;
	
	public LlistaPlantacions(int num) {
		llista = new Plantacions[num];
		numElem = 0;
	}
	
	public void afegir (Plantacions plantacions) {
		if (numElem < llista.length) {
			llista[numElem] = plantacions;
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
		String aux;
		if (numElem == 0) {
			aux = "No hi ha cap Plantacio.";
		}
		else {
			aux = "----------------Plantacions----------------\n";
			for (int i = 0; i < numElem; i++) {
					aux = aux +"\n"+ ++i + "- " +llista[--i].toString();
			}
		}
		return aux;
	}
}
