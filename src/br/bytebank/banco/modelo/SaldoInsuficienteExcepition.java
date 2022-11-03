package br.bytebank.banco.modelo;;

public class SaldoInsuficienteExcepition extends Exception{

	public SaldoInsuficienteExcepition(String msg) {
		super(msg);
	}
}
