package br.com.db1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NomesOrdenados {
	public static <Strings> void main(String[] args) {	
		List<String> numeros = new ArrayList<String>();
	
		numeros.add("ana");
        numeros.add("jose");
        numeros.add("danilo");
        Collections.sort(numeros);
        System.out.println(numeros);
}
}