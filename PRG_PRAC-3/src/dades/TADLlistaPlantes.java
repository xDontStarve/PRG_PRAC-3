/**
 * Interficie que especifica la implementació d'una llista de la classe Plantes
 * @author Jialiang Chen
 * @author Jose Luis Pueyo
 */
package dades;

public interface TADLlistaPlantes {

	/*
	 * Métode per afegir una planta a la llista
	 * @param planta: planta a afegir a la llista
	 * @return false: Error al afegir la planta | true: Planta afegida correctament
	 */
	public boolean afegirPlanta(Planta planta);

	/*
	 * Métode per eliminar una planta de la llista
	 * @param planta: planta a eliminar de la llista
	 * @return false: Error al eliminar la planta | true: Planta eliminada correctament
	 */
	public boolean eliminarPlanta(Planta planta);

	/*
	 * Métode que retorna el numero de elements de la llista
	 * @return Numero de elements a la llista
	 */
	public int getNumElem();

	/*
	 * Métode que retorna si una planta pertany o no a la llista
	 * @param planta: La planta a validar la pertinença en la llista
	 * @return false: La planta no pertany a la llista | true: La planta pertany a la llista
	 */
	public boolean pertany(Planta planta);

	/**
	
	 */
	public boolean ple();

	public boolean buit();

	/*
	 * Métode que retorna la posició d'una planta dins de la llista
	 * @param planta: planta a cercar la seva posició
	 * @return Posició de la planta dins de la llista (posició ∈ [0..nElem])
	 */
	public int getPosicio(Planta planta);

	/*
	 * Métode que retorna la planta amb el nom cientific especificat
	 * @param nomCientific: nom cientific de la planta que es vol obtenir de la llista
	 * @return La primera planta de la llista amb el nom cientific especificat per parametre
	 */
	public Planta getPlanta(String nomCientific);
	
}
