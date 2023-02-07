package entities;

public class Produto00 {

	private String nome;
	private Double price;

	public Produto00(String nome, Double price) {
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
	

	public boolean nonStaticProductPredicate() {
		return price >= 100.0;
	}

	@Override
	public String toString() {
		return "Produto [Nome = " + nome + ", Price = " + String.format("%.2f", price) + "]";
	}

}
