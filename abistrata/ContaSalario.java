package abistrata;

public class ContaSalario extends Conta{
	private double salario;
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public ContaSalario() {
		
	}
	public ContaSalario(double salario) {
		this.salario=salario;
	}
	
	public void Sacar(double valor) {
		this.saldo-=valor;
	}
}
