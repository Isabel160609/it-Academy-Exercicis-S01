
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Coche miCoche=new Coche();
			
			//creamos un objeto de la clase derivada
			miCoche.arrancar();
			//vemos que aqui llama al arrancar del hijo dentro de caminar
			miCoche.caminar();
			
			//si creamos un vehiculo directamente utiliza el arrancar del padre
			new Vehicle().caminar();
			
			//al realizar el upcasting igualmente llama al arrancar del hijo 
			Vehicle vehicle = miCoche;
			vehicle.caminar();
			
			
			
	}

}
