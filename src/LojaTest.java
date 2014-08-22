import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LojaTest {
	
	private Loja loja;
	
	@Before
	public void test() {
		loja = new Loja ("014b36", "Lojas Mini-Teste");
	}

	@Test
	public void testClienteComum() {
		Cliente cliente = this.loja.cadastrarCliente(new ClienteComum(), "Antonio da Silva", "000.000.000-00","Professor");
		
		assertTrue (cliente.getCodigoCartao().equals("0000"));
		assertTrue (cliente.getCpf().equals("000.000.000-00"));
		assertTrue (cliente.getNome().equals("Antonio da Silva"));
		assertTrue (cliente.getProfissao().equals("Professor"));
		assertFalse (cliente.getFiliacao()!= null);
		assertFalse (cliente.getIstituicaoDeEnsino() != null);
	}
	
	@Test
	public void testClienteMenorDeIdade() {
		Cliente cliente = this.loja.cadastrarCliente(new ClienteMenorDeIdade(), "Maria das Nesves", "120.540.520-95","Maria do Socorro");
		
		assertTrue (cliente.getCodigoCartao().equals("1111"));
		assertTrue (cliente.getCpf().equals("120.540.520-95"));
		assertTrue (cliente.getNome().equals("Maria das Nesves"));		
		assertTrue (cliente.getFiliacao().equals("Maria do Socorro"));
		assertTrue (cliente.getProfissao().equals("Estudante"));
		assertFalse (cliente.getIstituicaoDeEnsino() != null);
	}
	
	@Test
	public void testClienteUniversitario() {
		Cliente cliente = this.loja.cadastrarCliente(new ClienteUniversitario(), "Ricardo Luiz", "512.569.513-00","Universidade Federal da Paraíba");
		
		assertTrue (cliente.getCodigoCartao().equals("2222"));
		assertTrue (cliente.getCpf().equals("512.569.513-00"));
		assertTrue (cliente.getNome().equals("Ricardo Luiz"));			
		assertTrue (cliente.getProfissao().equals("Universitário"));
		assertTrue (cliente.getIstituicaoDeEnsino().equals("Universidade Federal da Paraíba"));
		assertFalse (cliente.getFiliacao() != null);
	}
	
}
