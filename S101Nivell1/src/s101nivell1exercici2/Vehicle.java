package s101nivell1exercici2;

//exercici2
public class Vehicle {

	public Vehicle() {
		
	}
	//metode
	public void  iniciar() {
		
	}
	//metode estatic
	public static void  parar() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ejecutem metode no estatic a traves d'un objecta de la clase
		new Vehicle().iniciar();
		
		//ejecutem metode estatic a traves de la clase
		Vehicle.parar();
		
	}
}
