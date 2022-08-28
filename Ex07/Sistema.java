package Ex07;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		int id, opcao;
		String agencia, numero;
		double saldo;
		
		
		ArrayList<ContaCorrente> listaContaC = new ArrayList<>();
		ArrayList<ContaPoupanca> listaContaP = new ArrayList<>();
		ArrayList<ContaSalario> listaContaS = new ArrayList<>();
		
		do {
		System.out.printf("Banco Digital\n\n");
		System.out.printf("1 - Cadastrar Conta Corrente"
				+ 		"2 - Cadastrar Conta Poupança"		
				+ 		"4 - Exibir Contas Corrente"
				+		"5 - Exibir Contas Poupança"
				+ 		"5 - Sair\n\n");
		
		System.out.printf("Digite a opção desejada: ");
		opcao = ler.nextInt();
		
		
		
			if (opcao == 1) {
				ContaCorrente cc = new ContaCorrente();
				
				id = listaContaC.size()+1;
				cc.setId(id);
				
				System.out.printf("Digite sua agencia: ");
				agencia = ler.next();
				cc.setAgencia(agencia);
				
				System.out.printf("Digite o número da conta: ");
				numero=ler.next();
				cc.setNumero(numero);
				
				System.out.printf("Digite seu saldo: ");
				saldo=ler.nextDouble();
				cc.setSaldo(saldo);
				System.in.read();
				
			}
			else if (opcao == 2) {
				ContaPoupanca cp = new ContaPoupanca();
				
				id = listaContaC.size()+1;
				cp.setId(id);
				
				System.out.printf("Digite sua agencia: ");
				agencia = ler.next();
				cp.setAgencia(agencia);
				
				System.out.printf("Digite o número da conta: ");
				numero=ler.next();
				cp.setNumero(numero);
				
				System.out.printf("Digite seu saldo: ");
				saldo=ler.nextDouble();
				cp.setSaldo(saldo);
				System.in.read();
				}
			
			else if (opcao == 3) {
				for (ContaCorrente c: listaContaC){
					System.out.printf("Nome: %s, Idade: %d, Sexo: %s, CPF: %s", c.getAgencia(), c.getNumero(), c.getSaldo());
				}
			}
			else if (opcao == 4) {
				for (ContaPoupanca p: listaContaP){
					System.out.printf("Nome: %s, Idade: %d, Sexo: %s, CPF: %s", p.getAgencia(), p.getNumero(), p.getSaldo());
				}
			}
			
		
		}while(opcao !=5);
	}
}
