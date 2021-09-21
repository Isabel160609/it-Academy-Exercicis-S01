package s101Nivell2Exercici2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Raton []ratones=new  Raton[4];
		 
		 ratones[0]= new Jerbo();
		 ratones[1]= new Hamster();
		 ratones[2]= new Jerbo();
		 ratones[3]= new Hamster();
		 // veiem que en cada cas invoca la funcio parlar de la seva clase
		 for (int i=0;i<ratones.length;i++) {
			 ratones[i].caminar();
		 }
	}

}
