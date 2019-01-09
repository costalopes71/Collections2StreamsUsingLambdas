package com.pluralsight.collections2streamsusinglambda.functionpackage;

import java.util.function.Predicate;

public class FunctionalInterfaces {

	/*
	 	Uma interface funcional eh o tipo dos lambdas. Ou seja, um lambda eh uma instancia de uma interface funcional. Foram introduzidas no java 8.
	 	Eh uma interface com apenas um metodo abstrato, metodos default e estaticos nao contam (ja que nao sao abstratos), os metodos da classe Object tbm
	 	nao contam mesmo que sejam abstratos.
	 	Uma interface pode ou nao ser anotada com a anotacao @FunctionalInterface. A anotacao ira permitir que o compilador cheque se a interface eh realmente
	 	funcional.
	 */
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// implementando a interface Predicate antes do java 8
		Predicate<String> p = new Predicate<String>() {
			@Override
			public boolean test(String s) {
				return s.length() < 20;
			}
		};
		
		// com java 8
		Predicate<String> p1 = (String s) -> s.length() < 20;
		// ou
		Predicate<String> p3 = s -> s.length() < 20;
		
		// como o lambda em questao eh uma instancia de uma interface eu posso usar seu unico metodo!
		System.out.println(p3.test("Ola! Sou uma instancia de uma interface funcional!"));
		
	}
	
}