package services;

import java.util.List;
import java.util.function.Predicate;

import entities.Produto03;

public class ProductService {
	
	public double filteredSum(List<Produto03> list, Predicate<Produto03> criteria) {
		double sum = 0.0;
		for (Produto03 p : list) {
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}