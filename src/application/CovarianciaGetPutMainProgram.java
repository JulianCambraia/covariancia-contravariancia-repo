package application;

import java.util.ArrayList;
import java.util.List;

/**
 * Princípio GET/PUT Contravariância
 * A Operação de GET NÃO É permitida e a operação de PUT É permitida
 * @author julian
 *
 */
public class CovarianciaGetPutMainProgram {

	public static void main(String[] args) {
		List<Object> objects = new ArrayList<Object>();
		objects.add("Maria");
		objects.add("José");
		
		List<? super Number> list = objects;
		list.add(3.14);
		list.add(20); // eu NÃO posso acessar o elemento porém é possível adicionar novos valores pois o compilador não consegue saber que SubTipo de Number está sendo passado 
		
		Number x = list.get(0); // erro de compilação
		Object x1 = list.get(0); // aqui já foi permitido pois é um SuperTipo de Number

	}

}
