package s101Nivell1Exercici6;

public class Frog extends Amphibian {
		
		
		private String  familia;
		
		public Frog(int pes,int llarg,int edad) {
			super(pes,llarg,edad);
			familia="Ranidae";
				
		}
		
		public String saltar() {
			String saltar="croac";
			return saltar;
		}

		
		@Override
		public String toString() {
			return "Amphibian [pes=" + pes + ", llarg=" + llarg + ", edad=" + edad + ", familia=" + familia + "]";
		}
}
