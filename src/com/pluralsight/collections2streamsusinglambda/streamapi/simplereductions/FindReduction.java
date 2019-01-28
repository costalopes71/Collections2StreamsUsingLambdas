package com.pluralsight.collections2streamsusinglambda.streamapi.simplereductions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindReduction {

	// Dois metodos: findFirst e findAny, esperam um Predicado como parametro e retornam quando um objeto que corresponde ao predicado eh achado.
	// findFirst: o primeiro objeto que corresponde ao predicado eh retornado
	// findAny: qqr objeto que corresponda ao predicado eh retornado
	
	// Ambos metodos podem nao retornar nada, por exemplo quando o stream esta vazio (por ter sido filtrado ja ou qqr outro motivo) ou se nao ha nenhum
	//valor que corresponda ao predicado. Por isso que eles retornam um Optional!
	
	
	public static void main(String[] args) {
		List<Integer> intsList = Arrays.asList(1, 54, 23, 56, 52, 21, 67,3, 7,86, 53,112, 34);

		// findFirst
		Optional<Integer> a = intsList.stream().filter(i -> i >50).findFirst();
		System.out.println(a.get());
		
		// findAny
		Optional<Integer> findAny = intsList.stream()
				.filter(i -> i > 50)
				.findAny();
		
		System.out.println(findAny.orElseGet(() -> 0));
		
	}
	
	
	
}
