package com.pluralsight.collections2streamsusinglambda.mapfilterreduce.livecoding;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReductionCaveatsUsingOperationWithNoIdentityElement {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		List<Integer> ints = Arrays.asList(-1, -2, -3, -4);
		
		BinaryOperator<Integer> op = (i1, i2) -> Integer.max(i1, i2); // ou
		BinaryOperator<Integer> op2 = Integer::max;
		
		int reduction = ReductionCaveatsUsingNonAssociativeReduction.reduce(ints, 0, op);
		
		// o resultado eh errado pois o elemento identificador de um max nao existe!!
		System.out.println("Max Reduction : " + reduction);
		
	}
	
}
