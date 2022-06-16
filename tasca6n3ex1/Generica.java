package tasca6n3ex1;

public class Generica<T> {

	public void metodeInterface(Telefon t1) { // posant un argument de tipus interface el que interpreto es que aquest
		// parametre permet qualsevol objecte d'una classe que implementi telefon
		t1.trucar();

		// No puc cridar al metode ferFotos(si fos static si) perque pertany a la classe
		// Smartphone i no a
		// la interface telefon, si em deixés fer-ho, faria que el metode no fos generic
		// per a totes les classes que implementen telefon.

	}

	public void metodeClasse(Smartphone s1) {
		s1.ferFotos();
	}
}
