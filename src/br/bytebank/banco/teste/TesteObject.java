package br.bytebank.banco.teste;

import br.bytebank.banco.modelo.Cliente;
import br.bytebank.banco.modelo.ContaCorrente;
import br.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {

		Object cc = new ContaCorrente(122,333);
		Object cp =  new ContaPoupanca(222, 666);
		Object c =  new Cliente();
		
		System.out.println(cc);
		System.out.println(cp);
		
	
	}

}
