package AulaArquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Scanner sc = null;
		String path = "C:\\itens_pedidos.txt";
		
		
		File arquivo = new File("C:\\pedidos.txt");
		
		try 
		(BufferedReader bw = new BufferedReader(new FileReader(arquivo))){
			
			
			String line = bw.readLine();
			
			
		while(line != null) {
			System.out.println(line);
			line = bw.readLine();
			
		}
		
		}catch(IOException e) {
            System.out.println("Erro ao ler no arquivo - " + e.getMessage());
        }
		

	}

}
