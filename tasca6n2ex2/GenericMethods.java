package tasca6n2ex2;

import java.util.Collection;

public class GenericMethods<T> {

	public void printGeneric(Collection<T> listaGenerica) { // posant la interface Collection ho faig encara m�s generic

		for (T generic : listaGenerica) { // faig un foreach perque sino amb les collections Set no aniria, aix� ho s�
											// per una explicacio a classe :D
			System.out.println(generic);
		}

	}

}
