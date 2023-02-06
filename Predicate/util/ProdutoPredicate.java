package util;

import java.util.function.Predicate;

import entities.Produto00;

public class ProdutoPredicate implements Predicate<Produto00> {

	@Override
	public boolean test(Produto00 p) {
		return p.getPrice() >= 100.0;
	}
}