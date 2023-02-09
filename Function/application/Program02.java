package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Produto02;

public class Program02 {

	public static void main(String[] args) {
		
		List<Produto02> list = new ArrayList<>();

		list.add(new Produto02("Tv", 900.00));
		list.add(new Produto02("Mouse", 50.00));
		list.add(new Produto02("Tablet", 350.50));
		list.add(new Produto02("HD Case", 80.90));
		
		List<String> nomes = list.stream().map(p -> p.getNome().toUpperCase()).collect(Collectors.toList());
		
		nomes.forEach(System.out::println);
	}
}