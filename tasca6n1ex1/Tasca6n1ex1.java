package tasca6n1ex1;

public class Tasca6n1ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("Manolo");
		Persona p2 = new Persona("Manolos");
		Persona p3 = new Persona("Manolis");
		NoGenericMethods a = new NoGenericMethods(p1, p2, p3);
		NoGenericMethods b = new NoGenericMethods(p2, p3, p1);
		System.out.println(a);
		System.out.println(b);
	}

}
