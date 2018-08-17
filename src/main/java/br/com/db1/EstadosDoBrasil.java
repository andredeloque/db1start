package br.com.db1;

public enum EstadosDoBrasil {
	AC("Acre",1),
	AL("Alagoas"),
	AP("Amapa"),
	AM("Amazonas"),
	BA("Bahia"),
	CE("Ceara"),
	DF("Distrito Federal"),
	ES("Espirito Santos"),
	GO("Goias"),
	MA("Maranhão"),
	MT("Mato Grosso"),
	MS("Matro Grosso do Sul"),
	MG("Minas Gerais"),
	PA("Paraiba"),
	PB("Paraíba"),
	PR("Paraná"),
	PE("Pernambuco"),
	PI("Piaui"),
	RJ("Rio de Janeiro"),
	RS("Rio Grande do Sul"),
	RO("Rondonia"),
	RR("Roraima"),
	SC("Santa Catarina"),
	SP("São Paulo"),
	SE("Sergipe"),
	TO("Tocantins");
	
private String nome;
private int numero;

private EstadosDoBrasil (String nome, int numero){
	this.nome = nome;
	this.numero = numero;
}
private EstadosDoBrasil (String nome){
	
}
private EstadosDoBrasil (int numero){
	
}
public String nome(){
	for (String valor : nome){
		System.out.println(valor);
	
	return nome;
}
}
}