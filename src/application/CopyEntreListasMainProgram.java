package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyEntreListasMainProgram {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4);
		List<Double> doubles = Arrays.asList(3.14, 6.28);
		List<Object> objects = new ArrayList<Object>();

		copy(integers, objects);
		imprimirLista(objects);
		
		copy(doubles, objects);
		imprimirLista(objects);
	}
	/**
	 * Aplica o princípio da Covariância e Contravariância
	 * @param origem
	 * @param destino
	 */
	public static void copy(List<? extends Number> origem, List<? super Number> destino) {
		for (Number number : origem) {
			destino.add(number);
		}
	}
	
	public static void imprimirLista(List<?> lista) {
		for (Object obj : lista) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}

}
