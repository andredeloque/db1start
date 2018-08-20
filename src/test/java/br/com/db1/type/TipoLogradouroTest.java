package br.com.db1.type;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TipoLogradouroTest {

	@Test
	public void siglaLogradouroTest(){
		assertEquals ("R", TipoLogradouro.RUA.getSiglaLogradouro());
		assertEquals ("Av", TipoLogradouro.AVENIDA.getSiglaLogradouro());
		assertEquals ("Fz", TipoLogradouro.FAZENDA.getSiglaLogradouro());
		assertEquals ("Pc", TipoLogradouro.PRACA.getSiglaLogradouro());


	}
}
