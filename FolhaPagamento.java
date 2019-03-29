
public class FolhaPagamento {
	
	private double horasTrabalhadas;
	private double salarioHoras;
	private int numeroDependentes;
	
	
	public FolhaPagamento(double horas, double salario, int filhos) {
		horasTrabalhadas = horas;
		salarioHoras = salario;
		numeroDependentes = filhos;
	}
	
	public int getNumeroDependentes() {
        return numeroDependentes;
    }

    public void setNumeroDependentes(int NumeroDependentes) {
        this.numeroDependentes = numeroDependentes;
    }
    
    public double getSalarioHoras() {
        return salarioHoras;
    }

    public void setSalarioHoras(double salarioHoras) {
        this.salarioHoras = salarioHoras;
    }
	
    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
	
    
	
	
	public double salarioBruto() {
	
		return  getHorasTrabalhadas() * getSalarioHoras() + (50 * getNumeroDependentes());
	}
	
	public double descontoInss() {
		if(salarioBruto() <= 1000) {
			return salarioBruto() * 8.5 / 100;
		}
		else {
			return salarioBruto() * 9 / 100;
		}
		
	}
	
	public double descontoIR() {
		if(salarioBruto() <= 500) {
			return  0;
		}
		else if(salarioBruto() > 1000) {
			return salarioBruto() * 7 / 100;
		}
		else {
			return salarioBruto() * 5 / 100;
		}
		 
	}
	
	public double liquido() {
		return salarioBruto() - descontoIR()- descontoInss();
	}
	
	
	
}
