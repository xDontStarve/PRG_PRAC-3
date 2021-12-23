/**
 * Autor: Jialiang Chen, Jose Luis Pueyo
*/
package dades;

public abstract class Planta implements Comparable<Planta> {

	private String nomCientific;
	private boolean tipus;

	public static final boolean ARBUSTICA = false, ARBOREA = true;

	public Planta(String nomCientific, boolean tipus) {
		this.nomCientific = nomCientific;
		this.tipus = tipus;
	}

	public String getNomCientific() {
		return this.nomCientific;
	}

	public boolean getTipus() {
		return this.tipus;
	}

	@Override
	public int compareTo(Planta planta) {
		return nomCientific.compareToIgnoreCase(planta.getNomCientific());
	}
}
