/** 
 * Classe llista terrenys
 * 
 * @author Joel lacambra Chen
 * @version 1.0
 * 
 */
package dades;


public class LlistaTerrenys {
	
	private Terrenys[] llista;
	private int numElem;
	
	public LlistaTerrenys(int num) {
		llista = new Terrenys[num];
		numElem = 0;
	}
	
	public void afegir (Terrenys terreny) {
		if (numElem < llista.length) {
			llista[numElem] = terreny;
			numElem++;
		}
	}
	
	public Terrenys getPos (int i) {
		return llista[i];
	}
	public String toString() {
		String aux;
		if ( numElem == 0) {
			aux = "No hi ha cap terreny a la llista";
		}
		else {
			aux = "----------------Informacio dels terrenys----------------\n";
			for (int i=0; i < numElem; i++) {
				aux = aux + "\n" + ++i + " - " + llista[--i].toString();
			}
		}
		return aux;
	}
	

}
