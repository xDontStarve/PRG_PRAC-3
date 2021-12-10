// Marc Fonseca
package dades;

public class Rodal {
	private String tipusTerreny;
    private float superficie;
    
    public Rodal (String tipusTerreny, float superficie){
        this.tipusTerreny = tipusTerreny;
        this.superficie = superficie;
    }

	public String getTipusTerreny() {
		return tipusTerreny;
	}

	public void setTipusTerreny(String tipusTerreny) {
		this.tipusTerreny = tipusTerreny;
	}

	public float getSuperficie() {
		return superficie;
	}

	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}

	@Override
	public String toString() {
		return "tipusTerreny = " + tipusTerreny + ", superficie = " + superficie;
		
	}
    
    
}
