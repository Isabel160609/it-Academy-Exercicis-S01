package s101Nivell1Exercici7;
/*Exercici 7. Modifiqui l'exercici anterior perquè l'objecte Frog substitueixi les definicions de mètodes de 
 * la classe basi
 *  (proporcioni noves definicions utilitzant les mateixes signatures de mètodes). Demostri el que ocorre en
 *   'main()'..*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Si creem un amfibi te metodes de amfibi
		Amphibian  anfibi=new Amphibian(2,2,1);
		
		System.out.println(anfibi.parlar());
		System.out.println(anfibi.toString());
		
		//al crear una granota te els metodes sobrescrits de granota
		Frog gustavo= new Frog(2,2,1);
		System.out.println(gustavo.toString());
		
		
		System.out.println(gustavo.parlar());
		System.out.println(gustavo.toString());
		
		//si fem una generalitzacio continua fent servir els metodes de granota
		Amphibian  anfibi2=new Frog(2,2,1);
		
		System.out.println(anfibi2.parlar());
		System.out.println(anfibi2.toString());
		
	}
	

}
