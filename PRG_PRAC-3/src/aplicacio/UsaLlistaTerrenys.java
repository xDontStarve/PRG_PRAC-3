/** 
 * Classe per utilitzar la classe de terrenys
 * 
 * @author Joel lacambra Chen
 * @version 1.0
 * 
 */
package aplicacio;

import dades.LlistaTerrenys;
import dades.Terrenys;

public class UsaLlistaTerrenys {

	/*public static void main(String[] args) {
		LlistaTerrenys llista = new LlistaTerrenys(2);
		comprobaLlistaTerrenys(llista);

	}

	*/
	public static void comprobaLlistaTerrenys(LlistaTerrenys llista) {
		String nomTerreny1 = "CalcariSolana";
		String[] nomPlantes1 = {"Pinus sylvestris", "Pinus nigra", "Fraxinus excelsior", "Acer pseudoplatanus", "Populus nigra"};
		int[] numPlantes1 = {150, 130, 220, 210, 190};
		
		String nomTerreny2 = "CalcariObaga";
		String[] nomPlantes2 = {"Pinus sylvestris", "Corylus Avellana", "Spartium junceum", "Quercus ilex", "Betula alba"};
		int[] numPlantes2 = {190, 200, 150, 200, 160};
		
		llista.afegir(new Terrenys(nomTerreny1, nomPlantes1, numPlantes1));
		llista.afegir(new Terrenys(nomTerreny2, nomPlantes2, numPlantes2));
		System.out.println(llista.toString());
	}
}
