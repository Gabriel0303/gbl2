
public class OlaMundo {
	public static void main(String[] args) {
		System.out.println("Exercício 1 \n");
		double gas = 3.79;
		double alc = 2.80;
		double comp = gas * 0.7;
		
		System.out.println("\n Valor Gasolina: " +  gas  );
		System.out.println("\n Valor Alcool: " +  alc  );
		System.out.println("\n Valor Gasolina * 0.7: " +  comp  );
		
		if(comp>alc) {
			System.out.println("\n Compensa Alcool  ");
		}
		else if(comp<alc) {
			System.out.println("\n Compensa Gasolina  ");
		}
		else  {
			System.out.println("\n Tanto faz  ");
		}
		
		
	}

}
