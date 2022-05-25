package tasca6n1ex2;

public class Tasca6n1ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Persona p = new Persona ("Alex", "Gutierrez", 40);
GenericMethods<Object> generic1 = new GenericMethods<Object>();
generic1.setPrimerDato(p);
generic1.setSegundoDato("hola");
generic1.setTercerDato(50);
generic1.printGeneric();
GenericMethods<Object> generic2 = new GenericMethods<Object>();
generic2.printGenericAmbParametres(50,p,"hola");
//No entenc com agafa el parametre 50 si 
	}

}
