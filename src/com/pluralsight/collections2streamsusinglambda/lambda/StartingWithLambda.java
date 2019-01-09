package com.pluralsight.collections2streamsusinglambda.lambda;

import java.util.Comparator;

public class StartingWithLambda {

	// Lamdas sao uma forma mais simples de escrever classes anonimas, servem para passar codigo como parametro!
	// Em Lambdas nao podemos usar tudo oq podemos usar em metodos normais, mas podemos usar alguns
	/*
	 	-> final: nos parametros da lambda para evitar que sejam alterados pelo codigo da expressao
	 	-> annotations: podemos por annotations nas lamdas tbm
	 	NAO eh possivel especificar o tipo de retorno
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//
		// exemplo usando Comparator
		//
		
		// modo antigo (usando classe anonima)
		Comparator<String> oldComparator = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		};
		
		// modo JAVA 8 > (usando Lambda)
		Comparator<String> newComparator = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());
		
		//
		// exemplo usando Runnable
		//
		
		// modo antigo (usando classe anonima)
		Runnable oldTaks = new Runnable() {
			@Override
			public void run() {
				int i = 0;
				while (i++ < 10) {
					System.out.println("It works!");
				}
			}
		};
		
		// modo JAVA 8 > (usando lambda)
		Runnable newTask = () -> {
			int i = 0;
			while (i++ < 10) {
				System.out.println("It works!");
			}
		};
		
		//
		// podemos omitir os tipos dos parametros em uma lambda
		//
		Comparator<String> comp = (s1, s2) -> Integer.compare(s1.length(), s2.length());
		
	}
	
}
