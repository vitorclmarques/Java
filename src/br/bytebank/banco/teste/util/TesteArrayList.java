package br.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.bytebank.banco.modelo.Conta;
import br.bytebank.banco.modelo.ContaCorrente;


public class TesteArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Conta> lista = new ArrayList <Conta>();
		
		Conta cc1 = new ContaCorrente(22,330); 
		lista.add(cc1);
			
		Conta cc2 = new ContaCorrente(22,331); 
		lista.add(cc2);
		
		System.out.println("Tamanho" + lista.size());
		Conta ref  = (Conta)lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamano" + lista.size());
	
	
		Conta cc3 = new ContaCorrente(62,430); 
		lista.add(cc3);
			
		Conta cc4 = new ContaCorrente(72,531); 
		lista.add(cc4);
		
		
		for(int i = 0; i < lista.size(); i++) {
			Object oRef =lista.get(i);
			System.out.println(oRef);
		}
	
		System.out.println("------------------------");
		
		for(Object oRef : lista) {
			System.out.println(oRef);
		}
	
	}

}
