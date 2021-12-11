/**
 * Autor: Jialiang Chen, Jose Luis Pueyo
*/
package aplicacio;
import dades.*;

public class UsaLlistes {

	public static void main(String[] args) {
		LlistaPlantes llista = new LlistaPlantes(50);
		comprobarLlista(llista);
		
	}
	
	
	
	public static void comprobarLlista(LlistaPlantes llista) {
		llista.afegirPlanta(new Arbustos("Arbusto Draculorius", 500, 1000));
		llista.afegirPlanta(new Arbres("Arbre de Nadal", new int[] {200, 400, 600}, new int[] {1, 3}));
		llista.afegirPlanta(new Arbres("Pino Draculorius", new int[] {50, 200, 600, 100}, new int[] {100, 120}));
		llista.afegirPlanta(new Arbustos("Planta Callejera", 10, 20));
		llista.toString();
	}
}
 