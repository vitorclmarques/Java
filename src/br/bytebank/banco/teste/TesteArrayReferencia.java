package br.bytebank.banco.teste;

import br.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencia {
	

	public static void main(String[] args) {
		
		Object []referencias = new Object[5];
		ContaCorrente cc1 = new ContaCorrente(22,330); 
		referencias[0]= cc1;
			
		ContaCorrente cc2 = new ContaCorrente(22,331); 
		referencias[1]= cc2;
		
		//System.out.println(contas[0].getNumero()	);
		
		ContaCorrente ref = (ContaCorrente) referencias[1];
		
		
		System.out.println(ref.getNumero());

	}
}
