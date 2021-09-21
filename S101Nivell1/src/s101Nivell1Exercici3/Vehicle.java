package s101Nivell1Exercici3;



public class Vehicle {
	public Vehicle() {
		
	}
	
	public String  iniciar() {
		String iniciar="He arrancat";
		return iniciar;
	}
	//metode estatic
	public static String  parar() {
		String parar="he parat";
		return parar;
	}
	
	public static void main(String[] args) {
		
		//Podem probocar la carrega cridant un metode estatic
		System.out.println(Vehicle.parar());
		
		//o iniciem la carregar al instanciar un objecta de la clase
		Vehicle car=new Vehicle();
		car.iniciar();
	}
}
