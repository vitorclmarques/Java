package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		//Fluxo de entrada
		
		OutputStream fis = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fis);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Lololololololololololo");
		
		
	

		bw.close();
	
	}
}
