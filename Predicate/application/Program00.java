package application;

import java.util.ArrayList;
import java.util.List;

import entities.Produto02;

public class Program00 {

	public static void main(String[] args) {
		
		List<Produto02> list = new ArrayList<>();

		list.add(new Produto02("Tv", 900.00));
		list.add(new Produto02("Mouse", 50.00));
		list.add(new Produto02("Tablet", 350.50));
		list.add(new Produto02("HD Case", 80.90));

		list.removeIf(p -> p.getPrice() >= 100);

		for (Produto02 p : list) {
			System.out.println(p);
		}
	}
}