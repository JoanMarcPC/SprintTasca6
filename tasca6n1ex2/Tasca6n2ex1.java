package tasca6n1ex2;

public class Tasca6n2ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 8;
		String word = "Hola";
		Persona p = new Persona("Alex", "Gutierrez", 40);

		GenericMethods<Object> generic1 = new GenericMethods<Object>();

		generic1.printGeneric(p, word, num);
		generic1.printGeneric(word, num, p);

	}

}
