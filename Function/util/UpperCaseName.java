package util;

import java.util.function.Function;

import entities.Produto02;

public class UpperCaseName implements Function<Produto02, String> {

	@Override
	public String apply(Produto02 p) {
		return p.getNome().toUpperCase();
	}

}
