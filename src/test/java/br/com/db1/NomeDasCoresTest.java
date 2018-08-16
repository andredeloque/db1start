package br.com.db1;

import org.junit.Test;

public class NomeDasCoresTest {
	@Test
	public void NomeDasCoresTest(){
		
		NomeDasCores cor = new NomeDasCores ();
		assertFalse (cor.NomeDasCores()== null);
	}
}
