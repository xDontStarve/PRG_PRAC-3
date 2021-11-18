package aplicacio;

import dades.*;

public class UsaLlistes {

	public static void main(String[] args) {
		
		Llista<Arbres> llistaArbres = new Llista<>(3);
		llistaArbres.afegir(new Arbres());
		System.out.println("Llista de "+llistaArbres.getLlista()[0].getClass().getSimpleName());
		
		Llista<Plantes> llistaPlantes = new Llista<>(3);
		llistaPlantes.afegir(new Plantes());
		System.out.println("Llista de "+llistaPlantes.getLlista()[0].getClass().getSimpleName());
		
		Llista<Plantacions> llistaPlantacions = new Llista<>(3);
		llistaPlantacions.afegir(new Plantacions());
		System.out.println("Llista de "+llistaPlantacions.getLlista()[0].getClass().getSimpleName());
		
	}

}
