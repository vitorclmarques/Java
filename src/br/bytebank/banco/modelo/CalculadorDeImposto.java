package br.bytebank.banco.modelo;

public class CalculadorDeImposto {

		private double totalImposto;

	    public void registra(Tributavel t){
	        double valor = t.getValorImposto();
	        this.totalImposto += valor;
	    }

	    public double getTotalImposto(){
	        return totalImposto;
	    }

		public void registra(ContaCorrente cc) {
			// TODO Auto-generated method stub
			
		}

	}

	

