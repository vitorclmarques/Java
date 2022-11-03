package br.bytebank.banco.teste;

import br.bytebank.banco.modelo.*;

public class TesteContas {

	public static void main(String[] args)throws SaldoInsuficienteExcepition {
		//full qualified name FQN
		ContaCorrente cc = new ContaCorrente(111,111);
		cc.deposita(200.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(100.0);
		
		 cc.transfere(100, cp)  	;
		 
		 System.out.println("CC: " + cc.getSaldo());
		 
		 System.out.println("CP: " + cp.getSaldo());
		 
		 
		
	}

}
