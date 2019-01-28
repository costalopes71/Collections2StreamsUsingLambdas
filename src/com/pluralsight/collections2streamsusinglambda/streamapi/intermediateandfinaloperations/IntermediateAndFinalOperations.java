package com.pluralsight.collections2streamsusinglambda.streamapi.intermediateandfinaloperations;

import java.util.ArrayList;
import java.util.List;

public class IntermediateAndFinalOperations {

	public static void main(String[] args) {
		
		
		List<String> lista = new ArrayList<>();
		
		lista.stream().map(s -> s.length())
			.peek(System.out::println)
			.filter(n -> n > 10)
			.forEach(System.out::println);
		
		// peek eh um operacao intermediaria e operacoes intermediarias nao vao trigar o processamento do Stream
		
		// forech eh uma operacao terminal e por isso triga o processamento do Stream.
		
		// peek geralmente eh usado para LOG e debug, evitar usar em producao
	
		/*
		Maneiras de distinguir chamadas terminais e intermediarias:
			1 - esta claramente dito no JAVADOC de cada metodo
			2 - chamadas que retornam um Stream sao intermediarias
			3 - chamadas que retornam alguma outra coisa ou void sao terminais
		 */
		
	}
	
}