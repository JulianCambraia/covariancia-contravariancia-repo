package application;

import java.util.ArrayList;
import java.util.List;

/**
 * Princípio GET/PUT Covariância
 * A Operação de GET é permitida e a operação de PUT não é permitida
 * @author julian
 *
 */
public class ContravarianciaGetPutMainProgram {

	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(10);
		integers.add(5);
		
		List<? extends Number> list = integers;
		
		Number x = list.get(0); // eu posso acessar o valor porém não é possível adicionar novos valores pois o compilador não consegue saber que SubTipo de Number está sendo passado
		
		list.add(20); // erro de compilação

	}

}
