package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		//Fluxo de entrada
		
//		OutputStream fis = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fis);
//		BufferedWriter bw = new BufferedWriter(osw);
//		
//		bw.write("Lololololololololololo");
		
		
		FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod \r\n");
		bw.newLine();
		bw.newLine();
		fw.write("alalalalalalalala");

		bw.close();
	
	}
}
