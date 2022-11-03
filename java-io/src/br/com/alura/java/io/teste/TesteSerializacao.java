package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		
//		Cliente cliente = new Cliente();
//		cliente.setNome("vitor");
//		cliente.setProfissao("dev");
//		cliente.setCpf("0224242");
//		
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("clente.bin"));
//		oos.writeObject(cliente);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		Cliente cliente = (Cliente) ois.readObject();
		ois.close();
		System.out.println(cliente.getCpf());		
		
	}

}
