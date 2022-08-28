package Ex07;

public class ContaCorrente extends Conta implements InterfaceConta{
	private double chequeEspecial;
	private double saldo;
	private String agencia;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	public ContaCorrente() {
		
	}
	
	
	public ContaCorrente(String agencia, String numero, double salario, double chequeEspecial) {
        super(agencia, numero, salario);
       
        this.chequeEspecial = chequeEspecial;
    }
	public void Depositar(double valor) {
		super.Depositar(valor, agencia);
		
		valor = valor + 0.50;
		this.setSaldo(valor);
	}
	public void Sacar(double valor) {
		this.saldo-=valor;
	}

	@Override
	public void mostrarSaldo(double saldo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Depositar() {
		// TODO Auto-generated method stub
		
	}


}

