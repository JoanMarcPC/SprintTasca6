package tasca6n2ex2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tasca6n2ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericMethods<Object> generic1 = new GenericMethods<Object>();

		Persona p1 = new Persona("Alex", "Gutierrez", 40);
		Persona p2 = new Persona("Manolo", "Sánchez", 60);
		List<Object> listaPersonas = new ArrayList<Object>();
		listaPersonas.add(p1);
		listaPersonas.add(p2);
		generic1.printGeneric(listaPersonas);

		Set<Object> listaEnteros = new HashSet<Object>();
		listaEnteros.add(50);
		listaEnteros.add(150);
		generic1.printGeneric(listaEnteros);

		List<Object> listaStrings = new ArrayList<Object>();
		listaStrings.add("Bcn");
		listaStrings.add("Badalona");
		generic1.printGeneric(listaStrings);

	}

}
