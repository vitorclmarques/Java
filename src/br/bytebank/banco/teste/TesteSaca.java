package br.bytebank.banco.teste;

import br.bytebank.banco.modelo.*;

public class TesteSaca {

	public static void main (String[]args) {
		Conta conta = new ContaCorrente(123,321);
		
		conta.deposita(200);
		try {
			conta.saca (210);		
		} catch (SaldoInsuficienteExcepition ex) {
			System.out.println("ERRO:" + ex.getMessage());
		}
		System.out.println(conta.getSaldo());
	}
}
