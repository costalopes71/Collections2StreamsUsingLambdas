package com.pluralsight.collections2streamsusinglambda.lambda;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

import com.pluralsight.collections2streamsusinglambda.lambda.model.Person;

// basicamente eh uma outra sintaxe de escrever lambdas
// eh apenas um outro jeito, nao muda nada na hora de compular e nem de processar. Talvez melhor apenas a leitura do codigo tornando-o mais limpo.
public class MethodReferences {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		// sem method reference
		Function<Person, Integer> function = p -> p.getAge();
		
		//com method reference
		Function<Person, Integer> function2 = Person::getAge;
		
		//
		// BinaryOperator (espera dois operadores de mesmo tipo e retorna um terceiro de mesmo tipo)
		//
		
		// sem method reference
		BinaryOperator<Integer> operator = (i1, i2) -> Integer.sum(i1, i2);
		
		// com method reference
		BinaryOperator<Integer> operator2 = Integer::sum;
		BinaryOperator<Integer> operator3 = Integer::max;
		
		//
		// Cosumer (espera um parametro e nao retorna nada)
		//
		
		// sem method reference
		Consumer<String> consumer = (s) -> System.out.println(s);
		
		// com method reference
		Consumer<String> consumer2 = System.out::println;
		
	}
	
}
