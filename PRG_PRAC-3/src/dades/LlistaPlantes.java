package dades;

/**
 * Classe que implementa la interficie TADLlistaPlantes que especifica la implementació d'una llista de la classe Plantes
 * @author Jialiang Chen
 * @author Jose Luis Pueyo
 */
public class LlistaPlantes implements TADLlistaPlantes{
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
	public boolean eliminarPlanta(Plantes planta) {
		return eliminar(getPosicio(planta));
	}

	private boolean eliminar(int pos){
		if (pos >= nElem || pos < 0) return false;
		
		nElem--;
		for (int i = 0; i < nElem; i++){
			llistaPlantes[i] = llistaPlantes[i+1];
		}
		return true;
	}

	@Override
	public int getNumElem() {
		return nElem;
	}

	@Override
	public boolean pertany(Plantes planta) {
		for (Plantes plantaLlista : llistaPlantes){
			if (plantaLlista.equals(planta)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int getPosicio(Plantes planta) {
		int pos = -1;
		for(int i = 0; i<llistaPlantes.length; i++){
			if (llistaPlantes[i].equals(planta)){	
				pos = i;
				break;
			}
		}
		return pos;
	}

	@Override
	public Plantes getPlanta(String nomCientific){
		for (Plantes planta : llistaPlantes){
			if (planta.getNomCientific().equals(nomCientific)){
				return planta;
			}
		}
		return null;
	}

	@Override
	public String toString(){
		String buffer = "Llista Plantes: \n";
		for (int i = 0; i < nElem; i++){
			buffer += i + "\t" + llistaPlantes[i].toString() + "\n";
		}
		return buffer;
	}
}
