package br.com.db1.type;

public enum TipoLogradouro {

	RUA("Rua"), 
	FAZENDA("Fazenda"),
	PRACA("Pra�a"),
	AVENIDA("Avenida");
	
	String descricaoLogradouro;
	
	private TipoLogradouro(String descricao){
		descricaoLogradouro = descricao;
	}
	
	public String getDescricaoLogradouro() {
		return descricaoLogradouro;
	}
	
}
