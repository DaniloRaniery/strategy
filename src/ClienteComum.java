
public class ClienteComum implements ClienteStrategy {
	
	private Cliente cliente;
	
	public Cliente cadastrar(String nome, String cpf, String profissao) {
		this.cliente = new Cliente();
		
		this.cliente.setCodigoCartao("0000");
		this.cliente.setCpf(cpf);
		this.cliente.setNome(nome);
		this.cliente.setProfissao(profissao);
		
		return cliente;
	}
}
