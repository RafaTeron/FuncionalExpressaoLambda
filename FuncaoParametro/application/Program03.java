package application;

import java.util.ArrayList;
import java.util.List;

import entities.Produto03;
import services.ProductService;

public class Program03 {

	public static void main(String[] args) {
		
		List<Produto03> list = new ArrayList<>();

		list.add(new Produto03("Tv", 900.00));
		list.add(new Produto03("Mouse", 50.00));
		list.add(new Produto03("Tablet", 350.50));
		list.add(new Produto03("HD Case", 80.90));
		
        ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list, p -> p.getNome().charAt(0) == 'T');
 
		System.out.println("Sum = " + String.format("%.2f", sum));
	}
}