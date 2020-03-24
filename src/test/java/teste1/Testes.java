package teste1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.navita.NumeroIrmao;

public class Testes {

	@Test
	public void test() {

		NumeroIrmao ni = new NumeroIrmao();
		assertEquals(ni.solucao(213), 321);
	}
	
	@Test
	public void testExceed() {

		NumeroIrmao ni = new NumeroIrmao();
		assertEquals(ni.solucao(100000001), -1);
	}

}
