package s101Nivell1Exercici5;
/*Exercici 5. Creu una classe amb un m�tode que estigui sobrecarregat tres vegades. Defineixi 
 * una nova classe que hereti de l'anterior i afegeixi una nova versi� sobrecarregada del m�tode. 
 * Mostri que els quatre m�todes estan disponibles en la classe derivada.*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Gat gat1=new Gat ();
		//Veiem els 3 metodes de animal
		gat1.parlar();
		gat1.parlar(3);;
		gat1.parlar("hola");
		
		///merode sorecargat de gat
		gat1.parlar(3,"hola");
		
		//es poden fer servir els 4 metodes sobrecarregats el del pare i el del fill
	}

}
