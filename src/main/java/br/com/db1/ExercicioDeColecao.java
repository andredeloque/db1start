package br.com.db1;

import java.util.ArrayList;
import java.util.List;

public class ExercicioDeColecao {

public static void main(String[] args) {
	List<String> nomes = new ArrayList<String>();
	nomes.add ("andre");
	System.out.println (nomes.size());
}

public static Integer exercicio2 ()  {
	List<String> nomes = new ArrayList<String>();
	nomes.add ("andre");
	nomes.add ("lopes");
	return nomes.size();
}	
	
}
