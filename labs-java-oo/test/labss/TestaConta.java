package labss;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import curso.oo.lab06.ex1.Conta;
import curso.oo.lab06.ex1.ContaService;

public class TestaConta {
	private Conta conta1;
	private ContaService servico;
	
	@Before
	public void  setUp(){
		servico = new ContaService();
		conta1 = new Conta();
	}
	
	@Test
	public void test() {
		assertNotNull("data não pode ser nular", conta1.getDataAbertura());
	}
	
	@Test
	public void testContaServiceDeposito(){
		servico.depositar(conta1, 100);
		assertEquals(100, conta1.getSaldo(),0);
	}

}
