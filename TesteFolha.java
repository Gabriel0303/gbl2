
public class TesteFolha {
	
	public static void main(String[] args) {
		
		FolhaPagamento salario = new FolhaPagamento(40,150.0,3); 
		
		System.out.println(" Salario Bruto:" + salario.salarioBruto());
		System.out.println(" Inss:" + salario.descontoInss());
		System.out.println(" IR:" + salario.descontoIR());
		System.out.println(" Salario Liquido:" + salario.liquido());
	}
	
}
