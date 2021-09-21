package s101Nivell1Exercici6;

public class Amphibian {
	protected int pes;
	protected int llarg;
	protected int edad;
	
	public Amphibian(int pes,int llarg,int edad) {
		
		this.pes=pes;
		this.llarg=llarg;
		this.edad=edad;	
	}
	
	public String parlar() {
		String parlar="estic parlant";
		return parlar;
	}

	@Override
	public String toString() {
		return "Amphibian [pes=" + pes + ", llarg=" + llarg + ", edad=" + edad + "]";
	}
	
}
