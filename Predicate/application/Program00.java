package application;

import java.util.ArrayList;
import java.util.List;

import entities.Produto01;

public class Program00 {

	public static void main(String[] args) {
		
		List<Produto01> list = new ArrayList<>();

		list.add(new Produto01("Tv", 900.00));
		list.add(new Produto01("Mouse", 50.00));
		list.add(new Produto01("Tablet", 350.50));
		list.add(new Produto01("HD Case", 80.90));

		list.removeIf(p -> p.getPrice() >= 100);

		for (Produto01 p : list) {
			System.out.println(p);
		}
	}
}