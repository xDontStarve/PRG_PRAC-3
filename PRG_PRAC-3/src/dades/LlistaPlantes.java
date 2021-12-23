package dades;

/**
 * Classe que implementa la interficie TADLlistaPlantes que especifica la implementació d'una llista de la classe Plantes
 * @author Jialiang Chen
 * @author Jose Luis Pueyo
 */
public class LlistaPlantes implements TADLlistaPlantes{
	private int nElem;
    private Planta llistaPlantes[];
    
    public LlistaPlantes (int mida) {
        this.nElem=0;
        llistaPlantes= new Planta[mida];
    }
    
    public boolean afegirPlanta(Planta planta) {
    	if (!ple() && !buit() && !pertany(planta)) {
    		int pos=nElem;
			for (int i=0; i<nElem;i++) {
    			if (llistaPlantes[i].compareTo(planta)==1){
    				pos = i;
    			}
			}
			return afegir(planta, pos);
    	}
    	return false;
    }
	
	public boolean afegir(Planta planta, int pos){
		if (!ple() && (pos < nElem+1 || pos > 0)){
			for (int i = ++nElem; i > pos; i--){
				llistaPlantes[i] = llistaPlantes[i-1];
			}
			llistaPlantes[pos]=planta;

			return true;
		}
		return false;
	}

	@Override
	public boolean eliminarPlanta(Planta planta) {
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
	public boolean pertany(Planta planta) {
		return getPosicio(planta) == -1;
	}

	@Override
	public int getPosicio(Planta planta) {
		int pos = -1;
		for(int i = 0; i < nElem; i++){
			if (llistaPlantes[i].equals(planta)){	
				pos = i;
				break;
			}
		}
		return pos;
	}

	@Override
	public Planta getPlanta(String nomCientific){
		for (int i = 0; i < nElem; i++){
			if (llistaPlantes[i].getNomCientific().equals(nomCientific)){
				return llistaPlantes[i];
			}
		}
		return null;
	}

	@Override
	public String toString(){
		String buffer = "Llista Plantes: \n";
		for (int i = 0; i < nElem; i++){
			buffer.concat(i + "\t" + llistaPlantes[i].toString() + "\n");
		}
		return buffer;
	}

	@Override
	public boolean ple() {
		return nElem == llistaPlantes.length;
	}
	
	@Override
	public boolean buit() {
		return nElem==0;
	}
}
