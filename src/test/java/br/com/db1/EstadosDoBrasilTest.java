package br.com.db1;

import org.junit.Test;

public class EstadosDoBrasilTest {
	
	@Test
	public void testarNomeDosEstados(){
		assertEquals ("PR",EstadosDoBrasil.PR.getNomeDoEstado);
	}
	
}
