package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Produto06;

public class Program06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Produto06> list = new ArrayList<>();
		
		System.out.print("Insira o caminho completo do arquivo : ");
		String path = sc.nextLine();
		File file = new File(path);
		
		double soma = 0;
		int media = 0;
		
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			String itemCsv = br.readLine();

			while (itemCsv != null) {
				String[] fields = itemCsv.split(",");
				String nome = fields[0];
				double preco = Double.parseDouble(fields[1]);
				Produto06 itens = new Produto06(nome, preco);
				list.add(itens);				
				
				soma += preco;
				media++;
				itemCsv = br.readLine();
								
			}

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
        
        soma = soma / media;
        System.out.printf("Preço médio : %.2f%n", soma);
        
        list.sort((p1,p2) -> p2.getNome().toUpperCase().compareTo(p1.getNome().toUpperCase()));
        
        for (Produto06 p : list) {
        	if (p.getPreco() < soma) {
        	System.out.println(p.getNome());
        	}
        }
        
		sc.close();

	}

}
