package service;

import java.util.List;
import java.util.function.Predicate;

import entities.Funcionario;

public class ServicoDeProduto {
	
	public double filteredSoma(List<Funcionario> list, Predicate<Funcionario> criteria) {
		double sum = 0.0;
		for (Funcionario f : list) {
			if (criteria.test(f)) {
				sum += f.getSalario();
			}
		}
		return sum;
	}
}
