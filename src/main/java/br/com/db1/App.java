package br.com.db1;

import java.math.BigDecimal;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //int zero = 0;
        Integer zeroObjeto = 0;
        char vogal = 'a';
        String vogalString = "a";
        
        double umPontoDois = 1.2;
       // Double valor2 = 2;
        Double valor3 = 2.0;
        
        Float valor4 = 3f;
        BigDecimal dinheiro = BigDecimal.ZERO;
        
        System.out.println(valor3);
        
        for (Integer x = 0; x < 100; x++){
            System.out.println(zeroObjeto);
            zeroObjeto++;
        if (zeroObjeto %2 == 0) {
        System.out.println(zeroObjeto+ "PAR");
        }
        }
        
        }
    }

