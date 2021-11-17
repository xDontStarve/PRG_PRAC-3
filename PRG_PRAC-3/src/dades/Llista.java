package dades;

public class Llista{
	private int nElem, mida;
    private <?> llista;
    private Plantes llistaPlantes[];
    private Plantacions llistaPlantacions[];
    private Terrenys llistaTerrenys[];
    public Llista (int mida, Object classe) {
        this.mida=mida;
        nElem=0;
        <> a = new Arrays();
    }
    public Llista (int mida, String nomClasse) {
        this.mida=mida;
        nElem=0;
        if (nomClasse.equalsIgnoreCase("Plantes")) {
            this.llistaPlantes = new Plantes[mida];
        }
        else if (nomClasse.equalsIgnoreCase("Plantacions")) {
            this.llistaPlantacions = new Plantacions[mida];
        }
        else if (nomClasse.equalsIgnoreCase("Terrenys")) {
            this.llistaTerrenys = new Terrenys[mida];
        }
    }
}
