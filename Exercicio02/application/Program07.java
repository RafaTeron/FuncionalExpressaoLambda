package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Funcionario;

/*Fazer um programa para ler os dados (nome, email e sal�rio)
de funcion�rios a partir de um arquivo em formato .csv.
Em seguida mostrar, em ordem alfab�tica, o email dos
funcion�rios cujo sal�rio seja superior a um dado valor
fornecido pelo usu�rio.
Mostrar tamb�m a soma dos sal�rios dos funcion�rios cujo
nome come�a com a letra 'M'.*/

public class Program07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o caminho completo do arquivo : ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Funcionario> list = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Funcionario(fields[0],fields[1],Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			System.out.print("Insira o sal�rio : ");
			double valor = sc.nextDouble();
			System.out.printf("E-mail de pessoas cujo sal�rio � superior a %.2f%n", valor);
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> emails = list.stream()
					.filter(f -> f.getSalario() > valor)
					.map(f -> f.getEmail())
					.sorted(comp)
					.collect(Collectors.toList());
			
			emails.forEach(System.out::println);
			
			double soma = list.stream()
					.filter(x -> x.getNome().charAt(0) == 'M')
					.map(x -> x.getSalario())
					.reduce(0.0, (x, y) -> x + y);
			
			System.out.printf("Soma dos sal�rios das pessoas cujo nome come�a com 'M' : %.2f", soma);

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
		
		sc.close();

	}

}
