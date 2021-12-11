/**
 * Autor: Jialiang Chen, Jose Luis Pueyo
*/
package dades;

import java.util.Arrays;

public class LlistaPlantes{
	private int nElem;
    private Plantes llistaPlantes[];
    
    public LlistaPlantes (int mida) {
        this.nElem=0;
        llistaPlantes= new Plantes[mida];
    }
    
    public boolean afegirPlanta(Plantes planta) {
    	if (nElem<llistaPlantes.length) {
    		llistaPlantes[nElem++]= planta;
    		return true;
    	}
    	return false;
    }

	@Override
	public String toString() {
		return "LlistaPlantes [nElem=" + nElem + ", llistaPlantes=" + Arrays.toString(llistaPlantes) + "]";
	}
	
}
