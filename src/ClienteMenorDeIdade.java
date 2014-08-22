
public class ClienteMenorDeIdade implements ClienteStrategy {

	private Cliente cliente;
	
	public Cliente cadastrar(String nome, String cpf, String filiacao) {
		this.cliente = new Cliente();
		
		this.cliente.setCodigoCartao("1111");
		this.cliente.setCpf(cpf);
		this.cliente.setNome(nome);
		this.cliente.setProfissao("Estudante");
		this.cliente.setFiliacao(filiacao);
		
		return cliente;
	}
}
