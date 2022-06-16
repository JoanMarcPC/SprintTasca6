package tasca6n3ex1;

public class Tasca6n3ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smartphone s1 = new Smartphone();
		Nokia n1 = new Nokia();

		Generica<Object> g1 = new Generica<Object>();
		g1.metodeInterface(n1);
		g1.metodeInterface(s1);
		g1.metodeClasse(s1);
		g1.metodeClasse(s1);
	}

}
