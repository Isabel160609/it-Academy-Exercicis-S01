package s101Nivell2Exercici1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Creem 3 objectes cycle cada un de una de les subclases
		Cycle unicycle = new Unicycle();
		Cycle bicycle = new Bicycle();
		Cycle tricycle = new Tricycle();
		// cridem als metodes i veiem que cada un fa servir el seu encara que esta
		// generalitzat
		unicycle.ride();
		bicycle.ride();
		tricycle.ride();

		// podem cridar als 2 constructors per veure el polimorfisme

		Tricycle rodes3 = new Tricycle();
		Tricycle rodes6 = new Tricycle(6);

		// creem una instancia de les 3 clases
		Unicycle unicycle1 = new Unicycle();
		Bicycle bicycle1 = new Bicycle();
		Tricycle tricycle1 = new Tricycle();

		ArrayList<Cycle> llistaCycles = new ArrayList<Cycle>();
		llistaCycles.add(unicycle1);
		llistaCycles.add(bicycle1);
		llistaCycles.add(tricycle1);

		for (int i = 0; i < llistaCycles.size(); i++) {

			// no puc invocar balance() per que no existeix per cyclo
			// llistaCycles.get(i).balance() //dona error

			// Si especialitzes pots accedir al metode balance()
			if (llistaCycles.get(i).rodes == 1) {
				Unicycle unicycle2 = (Unicycle) llistaCycles.get(i);
				unicycle2.balance();
			} else if (llistaCycles.get(i).rodes == 2) {
				Bicycle bicycle2 = (Bicycle) llistaCycles.get(i);
				bicycle2.balance();
			}
		}

	}

}
