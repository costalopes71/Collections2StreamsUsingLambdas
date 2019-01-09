package com.pluralsight.collections2streamsusinglambda.functionpackage;

import java.util.function.Predicate;

import com.pluralsight.collections2streamsusinglambda.lambda.model.Person;

public class ThePredicates {

	/*
		O Predicate espera um objeto de qualquer tipo e retorna um booleano. Eh usado no step de filter.
	 */
	
	/*
		public interface Predicate<T> {
			public boolean test(T t);
		}
	 */

	Predicate<Person> ageGT20 = person -> person.getAge() > 20;
	
	//
	// BiPredicate : espera dois objetos como parametros e retorna um booleano
	//
	
}