package AulaArquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) throws IOException {
		
		
		
		File arquivo = new File("C:\\Windows\\temp\\Ex13_Java.txt");
		
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