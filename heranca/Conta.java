package heranca;

import java.util.Date;

public class Conta {
	private String agencia;
	private String numero;
	private double saldo;
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Conta(){
		
	}
	public Conta(String agencia, String numero, double saldo) {
		this.agencia=agencia;
		this.numero=numero;
		this.saldo=saldo;
	}
	protected String exibirMensagem() {
		return "Bem vindo a conta do Everton";
	}
	
}
