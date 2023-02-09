package application;

import java.util.ArrayList;
import java.util.List;

import entities.Produto02;

public class Program01 {

	public static void main(String[] args) {
		
		List<Produto02> list = new ArrayList<>();

		list.add(new Produto02("Tv", 900.00));
		list.add(new Produto02("Mouse", 50.00));
		list.add(new Produto02("Tablet", 350.50));
		list.add(new Produto02("HD Case", 80.90));
		
		double factor = 1.1;
		
		list.forEach(p -> p.setPrice(p.getPrice() * factor));

		list.forEach(System.out::println);
	}
}