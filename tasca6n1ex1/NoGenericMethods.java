package tasca6n1ex1;

public class NoGenericMethods {
	private Persona p1;
	private Persona p2;
	private Persona p3;

	public NoGenericMethods(Persona p1, Persona p2, Persona p3) {

		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public Persona getP1() {
		return p1;
	}

	public void setP1(Persona p1) {
		this.p1 = p1;
	}

	public Persona getP2() {
		return p2;
	}

	public void setP2(Persona p2) {
		this.p2 = p2;
	}

	public Persona getP3() {
		return p3;
	}

	public void setP3(Persona p3) {
		this.p3 = p3;
	}
}