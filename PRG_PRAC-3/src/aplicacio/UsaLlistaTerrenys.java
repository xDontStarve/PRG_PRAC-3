/** 
 * Classe per utilitzar la classe de terrenys
 * 
 * @author Joel lacambra Chen
 * @version 1.0
 * 
 */
package aplicacio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputFilter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import dades.LlistaTerrenys;
import dades.Terrenys;

public class UsaLlistaTerrenys {

	public static void main(String[] args) {
		LlistaTerrenys llista = new LlistaTerrenys(2);
		//comprobaLlistaTerrenys(llista);
		String nomTerreny1 = "CalcariSolana";
		String[] nomPlantes1 = {"Pinus sylvestris", "Pinus nigra", "Fraxinus excelsior", "Acer pseudoplatanus", "Populus nigra"};
		int[] numPlantes1 = {150, 130, 220, 210, 190};
		
		String nomTerreny2 = "CalcariObaga";
		String[] nomPlantes2 = {"Pinus sylvestris", "Corylus Avellana", "Spartium junceum", "Quercus ilex", "Betula alba"};
		int[] numPlantes2 = {190, 200, 150, 200, 160};
		
		llista.afegir(new Terrenys(nomTerreny1, nomPlantes1, numPlantes1));
		llista.afegir(new Terrenys(nomTerreny2, nomPlantes2, numPlantes2));
		System.out.println(llista.toString());
		
		storeData(llista);
		
		
		LlistaTerrenys llistaTest = new LlistaTerrenys(2);
		readData(llistaTest);
		System.out.println(llistaTest.toString());
	}

	
	/*public static void comprobaLlistaTerrenys(LlistaTerrenys llista) {
		String nomTerreny1 = "CalcariSolana";
		String[] nomPlantes1 = {"Pinus sylvestris", "Pinus nigra", "Fraxinus excelsior", "Acer pseudoplatanus", "Populus nigra"};
		int[] numPlantes1 = {150, 130, 220, 210, 190};
		
		String nomTerreny2 = "CalcariObaga";
		String[] nomPlantes2 = {"Pinus sylvestris", "Corylus Avellana", "Spartium junceum", "Quercus ilex", "Betula alba"};
		int[] numPlantes2 = {190, 200, 150, 200, 160};
		
		llista.afegir(new Terrenys(nomTerreny1, nomPlantes1, numPlantes1));
		llista.afegir(new Terrenys(nomTerreny2, nomPlantes2, numPlantes2));
		System.out.println(llista.toString());
	}*/
	
	public static void storeData (LlistaTerrenys llista) {
		
		ObjectOutputStream outputFile;
		
		try {
			outputFile = new ObjectOutputStream(new FileOutputStream("test.ser"));
			for (int i = 0; i < 2; i++) {
				outputFile.writeObject(llista.getPos(i));
			}
			outputFile.close();
		}
		catch (IOException e) {
			System.out.println("Error arxiu de sortida");
		}
	}	
	
	public static void readData (LlistaTerrenys llista) {
		Terrenys test;
		ObjectInputStream inputFile;
		try {
			inputFile = new	 ObjectInputStream(new FileInputStream("test.ser"));
			for (int i = 0; i < 2; i++) {
				test = (Terrenys) inputFile.readObject(); 
				llista.afegir(test);
			}
		}
		catch (IOException e) {
			System.out.println("arxiu de entrada");
		} 
		catch (ClassNotFoundException e) {
			System.out.println("clase no trobada");
		}
		catch (ClassCastException e) {
			System.out.println("formar no correcte");
		}
	}
	
	
	// Opcio 2, llistar les dades de tots els tipus de terrenys
	public static void dadesTerrenys (LlistaTerrenys llista) {
		llista.toString();
	}
	
	// 15, opcio de guardar o no la informacio de les classes al fitxer o no.
	
	
	
		
}
