package br.com.db1.type;

import java.util.List;

public enum EstadosBrasileiros {
	AC("Acre"),
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
	
	String nomeDoEstado(){
		return nomeDoEstado;
	}
	public static List<EstadosDoBrasil> getEstadosDoSul(){
		uf.add(EstadosDoBrasil.PR);
	}
}
