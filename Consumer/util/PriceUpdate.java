package util;

import java.util.function.Consumer;

import entities.Produto01;

public class PriceUpdate implements Consumer<Produto01> {

	@Override
	public void accept(Produto01 p) {
		p.setPrice(p.getPrice() * 1.1);
	}
}