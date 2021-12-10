package aplicacio;
import dades.*;

public class UsaLlistes {

	public static void main(String[] args) {
		Plantes hola = new Arbustos("xds", Plantes.ARBUSTICA, 500000000, 1);
		Arbustos ola = (Arbustos)hola;
		System.out.println(ola.getAbsorcio());
	}
}
