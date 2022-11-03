package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWrite {

	public static void main(String[] args) throws IOException {
		//Fluxo de entrada
		
//		OutputStream fis = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fis);
//		BufferedWriter bw = new BufferedWriter(osw);
//		
//		bw.write("Lololololololololololo");
		
		//FileWriter fw = new FileWriter("lorem2.txt");
		//BufferedWriter bw = new BufferedWriter(fw);
		//PrintStream ps = new PrintStream("lorem2.txt");
		
		PrintWriter ps = new PrintWriter("lorem2.txt");
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod \r\n");
		ps.println();
		ps.println();
		ps.println();
		ps.println("alalalalalalalala");

		ps.close();
	
	}
}
