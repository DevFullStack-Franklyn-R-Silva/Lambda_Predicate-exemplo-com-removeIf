package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));

		// Forma padrão
		// list.removeIf(p -> p.getPrice() >= 100);

		// primeira forma Implementação da interface
		// list.removeIf(new ProductPredicate());

		// segunda forma Reference method com método estático
		// list.removeIf(Product :: staticProductPredicate);

		// terceira forma Reference method com método não estático
		// list.removeIf(Product :: nonStaticProductPredicate);

		// quarta forma Expressão lambda declarada
		// double min = 100.00;
		// Predicate<Product> pred = p -> p.getPrice() >= min;
		// list.removeIf(pred);

		// quinta forma Expressão lambda inline
		double min = 100.00;
		list.removeIf(p -> p.getPrice() >= min);

		for (Product p : list) {
			System.out.println(p);
		}
	}

}
