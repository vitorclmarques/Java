package br.bytebank.banco.teste.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.bytebank.banco.modelo.Cliente;
import br.bytebank.banco.modelo.Conta;
import br.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializaacaoConta {

	public static void main(String[] args) throws IOException {

		Cliente cliente = new Cliente();
		cliente.setNome("vitor");
		cliente.setProfissao("dev");
		cliente.setCpf("0224242");
		
		Conta cc = new ContaCorrente (222,33);
		cc.setTitular(cliente);
		cc.deposita(555.55);
		
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("clente.bin"));
		oos.writeObject(cc);
		oos.close();
	}

}
