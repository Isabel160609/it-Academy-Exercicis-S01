package s101Nivell2Exercici1;

public class Tricycle extends Cycle {

	public Tricycle() {
		rodes=3;
	}
	public Tricycle(int rodes) {
		super(rodes);
	}
	public void ride() {
		System.out.println("estic conduint amb "+ wheels() +" rodes");
	
	}
}
