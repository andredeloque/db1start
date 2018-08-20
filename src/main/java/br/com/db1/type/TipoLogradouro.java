package br.com.db1.type;

public enum TipoLogradouro {

	RUA("Rua", "R"), 
	FAZENDA("Fazenda", "F"),
	PRACA("Pra�a","Pc"),
	AVENIDA("Avenida", "Av");
	
	String descricaoLogradouro;
	String siglaLogradouro;
	private TipoLogradouro(String descricao, String sigla){
		descricaoLogradouro = descricao;
		siglaLogradouro = sigla;
	}
	public String getSiglaLogradouro() {
		return siglaLogradouro;
	}
	public String getDescricaoLogradouro() {
		return descricaoLogradouro;
		
	}
	
}
