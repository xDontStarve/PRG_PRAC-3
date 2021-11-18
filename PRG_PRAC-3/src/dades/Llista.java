package dades;

public class Llista <T> {
	private int nElem, mida;
    private T[] llista;
    
    public Llista (int mida) {
        this.mida=mida;
        nElem=0;
        llista = (T[]) new Object[mida];
    }
    
    public boolean afegir(T element) {
    	llista[0] = element;
    	return true;
    }
    
    public <T> T[] getLlista() {
    	return (T[]) llista;
    }
}
