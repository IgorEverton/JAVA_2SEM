package Ex07;

import abistrata.Conta;

public class ContaPoupanca extends Conta implements InterfaceConta{
		private double rentabilidade;
		private double saldo;
		

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public double getRentablidade() {
			return rentabilidade;
		}

		public void setRentabilidade(double rentabilidade) {
			this.rentabilidade = rentabilidade;
		}
		public ContaPoupanca() {
			
		}
		public ContaPoupanca(double rentabilidade) {
			this.rentabilidade=rentabilidade;
		}
		public ContaPoupanca(String agencia, String numero, double salario, double rentabilidade) {
			super(agencia, numero, salario);
			
			this.rentabilidade=rentabilidade;
		}
		public void Depositar(double valor) {
			super.Depositar(valor);
			
			valor = valor - 0.50;
			this.setSaldo(valor);
			}
		public void Sacar(double valor) {
			this.saldo-=valor;
		}

		@Override
		public void mostrarSaldo(double saldo) {
			// TODO Auto-generated method stub
			
		}
	}

