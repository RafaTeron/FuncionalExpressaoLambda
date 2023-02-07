package application;

import java.util.ArrayList;
import java.util.List;

import entities.Produto01;

public class Program01 {

	public static void main(String[] args) {
		
		List<Produto01> list = new ArrayList<>();

		list.add(new Produto01("Tv", 900.00));
		list.add(new Produto01("Mouse", 50.00));
		list.add(new Produto01("Tablet", 350.50));
		list.add(new Produto01("HD Case", 80.90));
		
		list.forEach(Produto01::staticPriceUpdate);

		list.forEach(System.out::println);
	}
}