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

		// Forma padr�o
		// list.removeIf(p -> p.getPrice() >= 100);

		// primeira forma Implementa��o da interface
		// list.removeIf(new ProductPredicate());

		// segunda forma Reference method com m�todo est�tico
		// list.removeIf(Product :: staticProductPredicate);

		// terceira forma Reference method com m�todo n�o est�tico
		// list.removeIf(Product :: nonStaticProductPredicate);

		// quarta forma Express�o lambda declarada
		// double min = 100.00;
		// Predicate<Product> pred = p -> p.getPrice() >= min;
		// list.removeIf(pred);

		// quinta forma Express�o lambda inline
		double min = 100.00;
		list.removeIf(p -> p.getPrice() >= min);

		for (Product p : list) {
			System.out.println(p);
		}
	}

}
