package entities;

public class Produto01 {

	private String nome;
	private Double price;

	public Produto01(String nome, Double price) {
		this.nome = nome;
		this.price = price;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public static void staticPriceUpdate(Produto01 p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	@Override
	public String toString() {
		return "Produto [Nome = " + nome + ", Price = " + String.format("%.2f", price) + "]";
	}

}
