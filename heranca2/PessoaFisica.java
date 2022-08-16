package heranca2;

public class PessoaFisica extends Pessoa{
	private String cpf;
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public PessoaFisica(){
		
	}
	public PessoaFisica(String nome, String sexo, int idade, int id, String cpf) {
		super(nome, sexo, idade, id);
		
		this.cpf=cpf;
	}
}
