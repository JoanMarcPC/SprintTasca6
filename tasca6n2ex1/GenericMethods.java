package tasca6n2ex1;

public class GenericMethods<T> {
private Persona primerDato;
private T segundoDato;
private T tercerDato;



public void printGenericAmbParametres(Persona primero,T segundo, T tercero) {
	System.out.println(primero.toString());
	System.out.println(segundo.toString());
	System.out.println(tercero.toString());
}
public void printGeneric() {
	System.out.println(this.primerDato.toString());
	System.out.println(this.segundoDato.toString());
	System.out.println(this.tercerDato.toString());
}



public Persona getPersona() {
	return primerDato;
}



public void setPrimerDato(Persona primerDato) {
	this.primerDato = primerDato;
}



public T getSegundoDato() {
	return segundoDato;
}



public void setSegundoDato(T segundoDato) {
	this.segundoDato = segundoDato;
}



public T getTercerDato() {
	return tercerDato;
}



public void setTercerDato(T tercerDato) {
	this.tercerDato = tercerDato;
}

}



