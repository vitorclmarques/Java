package br.bytebank.banco.modelo;;

/**
 * A classe representa a moldura de uma conta 
 * @author vitor
 *
 */


public abstract	class Conta extends Object implements Comparable <Conta>{
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular ;
	private static int total;
	
	/**
	 * Construtor para inicializar o objeto conta a partir da agencia e o numero.
	 *  
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("O total de conta � " + total);
		this.agencia = agencia;
		this.numero = numero;
		
	}
	
	public abstract void deposita(double valor);
	
	
	/**
	 * O valor precisa ser maior que o saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteExcepition
	 */
	public void saca (double valor) throws SaldoInsuficienteExcepition {
		
		if(this.saldo < valor) {
            throw new SaldoInsuficienteExcepition("Saldo" + this.saldo + ", Valor" + valor); 
		} 
	
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteExcepition{
	  this.saca(valor);
	  destino.deposita(valor);
	}		
	public double getSaldo() {
		return this.saldo;
		
	}
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero (int numero){
		if (numero <= 0 ) {
			System.out.println("N�o pode numero menor ou igual a 0");
		}
		this.numero = numero;
		}
	 public int getAgencia() {
		return this.agencia;
	}
	 public void setAgencia(int agencia) {
		 if (agencia <= 0 ) {
			 System.out.println("Erro n�o pode realizar por conta do valor ");
			 return;
		 }
		this.agencia = agencia;
	}
	 public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	 public Cliente getTitular() {
		return titular;
	}
	 public static int getToal() {
		 return Conta.total;
		
	}
	 @Override
	 public boolean equals (Object ref) {
		 
		 Conta outra = (Conta) ref;
		 
		 if(this.agencia != outra.agencia) {
			 return false;
		 }
		 
		 if(this.numero != outra.numero) {
			 return false;
		 }
		 
		 return true;
		 
	 }
	 
	 @Override
	public int compareTo(Conta outra) {
	   return Double.compare(this.saldo, outra.saldo);
	}
	 
	 @Override
		public String toString() {

			return "Numero: " + this.numero + " ,Agencia: " + this.agencia + ", Saldo: " + this.saldo;
		}
	}
