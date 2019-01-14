package com.pluralsight.collections2streamsusinglambda.mapfilterreduce.livecoding;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Eh importantissimo lembrar que so posso fazer reduction de operacoes que forem associativas! Se eu fizer de uma operacao nao associativa nao ira
 * dar erro de compilacao e nem em tempo de execucao, porem, o resultado estara errado!!
 */
public class ReductionCaveatsUsingNonAssociativeReduction {


	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
		List<Integer> ints = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		// duas listas de ints para simular processamento em paralelo
		List<Integer> ints1 = Arrays.asList(0, 1, 2, 3, 4);
		List<Integer> ints2 = Arrays.asList(5, 6, 7, 8, 9);
		
		// a soma eh uma operacao associativa, logo a computacao sera correta
		BinaryOperator<Integer> opSum = (i1, i2) -> i1 + i2;
		BinaryOperator<Integer> opMax = Integer::max; // max tbm eh associativa e nesse caso dara certo, mas o seu identificador nao eh 0 logo essa
		// computacao poderia dar errado se esta lista tivesse apenas numeros negativos por exemplo
		
		// simulando paralelismo com soma
		int sumReduction1 = reduce(ints1, 0, opSum);
		int sumReduction2 = reduce(ints2, 0, opSum);
		int sumParalelReduction = reduce(Arrays.asList(sumReduction1, sumReduction2), 0, opSum);
		
		// simulando paralelismo com max
		int maxReduction1 = reduce(ints1, 0, opMax);
		int maxReduction2 = reduce(ints2, 0, opMax);
		int maxParalelReduction = reduce(Arrays.asList(maxReduction1, maxReduction2), 0, opMax);
		
		
		int reduction = reduce(ints, 0, opSum);
		
		System.out.println("Sum Reduction: " + reduction);
		System.out.println("Paralel Sum Reduction: " + sumParalelReduction);
		
		System.out.println("\nParalel Max Reduction " + maxParalelReduction);
		
		// exemplo de operacao NAO ASSOCIATIVA
		BinaryOperator<Integer> nonAssociativeOp = (i1, i2) -> (i1 + i2) * (i1 + i2);
		BinaryOperator<Integer> otherNonAssociativeOp = (i1, i2) -> (i1 + i2) / 2;
		
		int nonAssociativeReduction = reduce(ints, 0, nonAssociativeOp);
		
		int nonAssociativeReduction1 = reduce(ints1, 0, nonAssociativeOp);
		int nonAssociativeReduction2 = reduce(ints2, 0, nonAssociativeOp);
		int nonAssociativeParalelReduction = reduce(Arrays.asList(nonAssociativeReduction1, nonAssociativeReduction2), 0, nonAssociativeOp);
		
		System.out.println("\nNon associative series reduction: " + nonAssociativeReduction);
		System.out.println("Non associative paralel reduction: " + nonAssociativeParalelReduction);
		
	}

	static int reduce(List<Integer> values, int valueIfEmpty, BinaryOperator<Integer> reduction) {

		int result = valueIfEmpty;
		
		for (Integer value : values) {
			result = reduction.apply(result, value);
		}
		
		return result;
	}
	
}
