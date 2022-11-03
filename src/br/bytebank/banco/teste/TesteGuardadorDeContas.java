package br.bytebank.banco.teste;

import br.bytebank.banco.modelo.Conta;
import br.bytebank.banco.modelo.ContaCorrente;
import br.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorDeContas {

	public static void main(String[] args ) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente (22,21);
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente (23,27);
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQuantidaDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencias(1);
		System.out.println(ref.getNumero());
	}
}
