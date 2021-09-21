package s101Nivell1Exercici4;

public class Vehicle {
	
	// es crea una per objecte creat i no es podra modificar
	public final String matricula;
	//es crea per tota la clase i no es pot modificar
	public static final int capacidad=5;
	
	
	public Vehicle (String matricula) {
		this.matricula=matricula;
	}
	public static void main(String[] args) {
		
		//puc cridar la variable de la clase
		System.out.println(Vehicle.capacidad);
		
		Vehicle v1= new Vehicle ("12345X");
		Vehicle v2= new Vehicle ("56789X");
		
		
		//capacitat es igual per tot els objectes i no es pot modificar
		System.out.println(v1.capacidad);
		
		System.out.println(v2.capacidad);
		
		//la matricula es diferent per cada objecte pero un cop creat no es pot modificar
		System.out.println(v1.matricula);
		
		System.out.println(v2.matricula);
		
	
	}
	
}
