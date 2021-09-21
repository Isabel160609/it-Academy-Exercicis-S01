package s101Nivell2Exercici1;

public class Unicycle extends Cycle{
	public Unicycle() {
		rodes=1;
	}
	public Unicycle(int rodes) {
		super(rodes);
	}
	public void ride() {
		System.out.println("estic conduint amb "+ wheels() +" rodes");
	}
	
	public void balance() {
		System.out.println("estic equilibrat");
	}
}
