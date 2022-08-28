package Ex07;

public class ContaSalario extends Conta implements InterfaceConta{
	private int cnpjEmpregador, id;
	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCnpjEmpregador() {
		return cnpjEmpregador;
	}

	public void setCnpjEmpregador(int cnpjEmpregador) {
		this.cnpjEmpregador = cnpjEmpregador;
	}
	public void mostrarSaldo(double saldo) {
		this.getSaldo();
	}
	public void Sacar(double valor) {
		this.saldo= saldo - valor;
	}

	@Override
	public void Depositar() {
		// TODO Auto-generated method stub
		
	}
}
