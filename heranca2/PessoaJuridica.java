package heranca2;

public class PessoaJuridica extends Pessoa{
	private String cnpj;

	public PessoaJuridica() {
		
	}
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	PessoaJuridica(String nome, String sexo, int idade, int id, String cnpj){
		super(nome, sexo ,idade, id);
		this.cnpj=cnpj;
	}
}
