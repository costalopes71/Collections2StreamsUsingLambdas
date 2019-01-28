package com.pluralsight.collections2streamsusinglambda.streamapi.simplereductions;

import java.util.Arrays;
import java.util.List;

public class MatchReductions {

	public static void main(String[] args) {
		
		// Match testa se os elementos do Stream correspondem ao predicado
		// Sao operacoes terminais
		List<Integer> ints = Arrays.asList(1, 3, 5, 7, 8, 9, 10, 223, 34, 56);
		
		
		// anyMatch -> pelo menos um corresponde ao predicado
		
		boolean GT200 = ints.stream()
						.anyMatch(n -> n > 200);
		System.out.println("Ha numeros maiores que 200 no stream: " + GT200);
		
		//allMatch -> todos elementos devem corresponder ao predicado, se um nao corresponder retorna falso
		boolean noNegatives = ints.stream()
								  .allMatch(n -> n > 0);
		System.out.println("Nao ha numeros negativos: " + noNegatives);		
		
		// noneMatch -> se nenhum dos elementos corresponde ao predicado retorna true		
		boolean GT1000 = ints.stream()
							 .noneMatch(n -> n > 1000);
		System.out.println("Nao ha nenhum numero maior que 1000: " + GT1000);

		/*
		Todos os 3 matchers podem nao precisar avaliar o predicado para todos os elementos (por exemplo, se o quinto elemento for falso pra um
		allMatch ele ja retorna o resultado e nao necessita avaliar pros demais elementos), por isso sao chamados de short-circuting terminal operations
		 */
		
	}
	
}
