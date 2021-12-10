// Marc Fonseca
package dades;

public class Plantacions {
	private String nomPartida;
    private int anyPlantacio;
    private LlistaRodals rodals;
    
    public Plantacions (String nomPartida, int anyPlantacio, LlistaRodals rodals){
        this.nomPartida = nomPartida;
        this.anyPlantacio = anyPlantacio;
        this.rodals = rodals;
       /* for (int i = 0; i < tipusTerreny.length; i++) {
        	rodals.afegir(new Rodal(tipusTerreny[i], superficie[i]));
        }*/
    }

	public String getNomPartida() {
		return nomPartida;
	}

	public void setNomPartida(String nomPartida) {
		this.nomPartida = nomPartida;
	}

	public int getAnyPlantacio() {
		return anyPlantacio;
	}

	public void setAnyPlantacio(int anyPlantacio) {
		this.anyPlantacio = anyPlantacio;
	}

	@Override
	public String toString() {
		String aux ="";
		
		aux = "nomPartida = " + nomPartida + ", anyPlantacio = " + anyPlantacio;
		aux += "\t\t"+rodals.toString();
		
		
		return aux;
	}

    

}
