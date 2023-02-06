package application;

import java.util.ArrayList;
import java.util.List;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		
		List<Produto> list = new ArrayList<>();
		
		list.add(new Produto("TV", 1700.00));
		list.add(new Produto("Notebook", 2000.00));
		list.add(new Produto("Tablet", 1000.00));
		
		list.sort((p1,p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));
		
		for(Produto p : list) {
			System.out.println(p);
		}
	

	}

}
