package br.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.bytebank.banco.modelo.Conta;
import br.bytebank.banco.modelo.ContaCorrente;


public class TesteArrayListEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Conta cc1 = new ContaCorrente(22,330);
//		Conta cc2 = new ContaCorrente(22,330);
//		
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);
		
		ArrayList <Conta> lista = new ArrayList <Conta>();
		
		Conta cc1 = new ContaCorrente(22,330); 
		lista.add(cc1);
			
		Conta cc2 = new ContaCorrente(22,331); 
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22,331);
		boolean existe = lista.contains(cc3);
		
		System.out.println("Já existe? " + existe);
	
		
		
		for(Object oRef : lista) {
			System.out.println(oRef);
		}
	
	}

}
