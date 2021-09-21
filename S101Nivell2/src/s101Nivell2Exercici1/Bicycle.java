package s101Nivell2Exercici1;

public class Bicycle extends Cycle{
	
	public Bicycle() {
		rodes=2;
	}
	public Bicycle(int rodes) {
		super(rodes);
	}
	public void ride() {
		System.out.println("estic conduint amb "+ wheels() +" rodes");
	}
	
	public void balance() {
		System.out.println("estic equilibrat");
	}
}
