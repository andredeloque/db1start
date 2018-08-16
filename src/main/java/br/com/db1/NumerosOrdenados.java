package br.com.db1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumerosOrdenados {
	public static <Strings> void main(String[] args) {	
		List<String> numeros = new ArrayList<String>();
	
		numeros.add("3");
        numeros.add("1");
        numeros.add("2");
        Collections.sort(numeros);
        System.out.println(numeros);
}
}