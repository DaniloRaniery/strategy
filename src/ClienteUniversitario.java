
public class ClienteUniversitario implements ClienteStrategy {

	private Cliente cliente;
	
	public Cliente cadastrar(String nome, String cpf, String istituicaoDeEnsino) {
		this.cliente = new Cliente();
		
		this.cliente.setCodigoCartao("2222");
		this.cliente.setCpf(cpf);
		this.cliente.setNome(nome);
		this.cliente.setProfissao("Universitário");
		this.cliente.setIstituicaoDeEnsino(istituicaoDeEnsino);
		
		return cliente;
	}
}
