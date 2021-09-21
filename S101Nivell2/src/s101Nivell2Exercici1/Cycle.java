package s101Nivell2Exercici1;

public class Cycle {
	protected int rodes;
	
	public Cycle() {
		rodes=1;
	}
	public Cycle(int rodes) {
		this.rodes=rodes;
	}
	public void ride() {
		System.out.println("estic conduint");
	}
	public int wheels() {
		return rodes;
	}
}
