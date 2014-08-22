
public class Loja {
	
	private String codigoDaLoja, nomeDaLoja;
	
	public Loja(String codigo, String nome){
		this.codigoDaLoja = codigo;
		this.nomeDaLoja = nome;
	}
		
	public String getCodigoDaLoja() {
		return codigoDaLoja;
	}

	public void setCodigoDaLoja(String codigoDaLoja) {
		this.codigoDaLoja = codigoDaLoja;
	}

	public String getNomeDaLoja() {
		return nomeDaLoja;
	}

	public void setNomeDaLoja(String nomeDaLoja) {
		this.nomeDaLoja = nomeDaLoja;
	}

	public Cliente cadastrarCliente(ClienteStrategy cliente, String informacao1, String informacao2, String informacao3){
		return cliente.cadastrar(informacao1, informacao2, informacao3);
	}

}
