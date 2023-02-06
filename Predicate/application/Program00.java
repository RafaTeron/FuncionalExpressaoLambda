package application;

import java.util.ArrayList;
import java.util.List;

import entities.Produto00;
import util.ProdutoPredicate;

public class Program00 {

	public static void main(String[] args) {
		
		List<Produto00> list = new ArrayList<>();

		list.add(new Produto00("Tv", 900.00));
		list.add(new Produto00("Mouse", 50.00));
		list.add(new Produto00("Tablet", 350.50));
		list.add(new Produto00("HD Case", 80.90));

		list.removeIf(new ProdutoPredicate());

		for (Produto00 p : list) {
			System.out.println(p);
		}
	}
}