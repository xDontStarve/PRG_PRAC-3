package dades;

public abstract class Plantes {
	private String nomCientific;
	private boolean tipus;
	
	public static final boolean ARBUSTICA=false, ARBOREA=true;
	
	public Plantes (String nomCientific, boolean tipus) {
		this.nomCientific=nomCientific;
		this.tipus=tipus;
	}
	public String getNomCientific() {
		return this.nomCientific;
	}
	
	public boolean getTipus() {
		return this.tipus;
	}
}
