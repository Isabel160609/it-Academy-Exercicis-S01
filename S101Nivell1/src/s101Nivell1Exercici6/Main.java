package s101Nivell1Exercici6;
/*Exercici 6. Creu una classe denominada Amphibian. A partir d'aquesta, defineixi una nova classe
 *  denominada Frog que hereti de l'anterior. Inclogui una sèrie de mètodes apropiats en la classe
 *   basi. En 'main()' creu un objecte Frog i relice una generalització a Amphibian, demostrant que
 *    tots els mètodes continuen funcionant.*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//metodes de granota
		Frog gustavo= new Frog(2,2,1);
		
		System.out.println(gustavo.toString());
		System.out.println(gustavo.parlar());
		
		
		//fem una generalitzacio i veiem que els seus metodes son els mateixos
		
		Amphibian amfibio=new Frog(2,2,1);
		
		System.out.println(amfibio.parlar());
		System.out.println(amfibio.toString());
		
		
		
	}
	

}
