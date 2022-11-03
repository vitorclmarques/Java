package br.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteInteger {

	public static void main(String[] args) {

		
		
		
		int idade = 29;
		Integer idadeRef =  new Integer (29);
		
		
		int valor = idadeRef.intValue();
		String s =  args[0];
		
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		List<Integer> numeros =  new ArrayList<Integer>();
		numeros.add(idadeRef);
	}

}
