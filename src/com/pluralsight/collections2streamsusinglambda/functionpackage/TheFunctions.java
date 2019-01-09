package com.pluralsight.collections2streamsusinglambda.functionpackage;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import com.pluralsight.collections2streamsusinglambda.lambda.model.Person;

public class TheFunctions {

	/*
	 	A Function espera um objeto como parametro e retorna outro objeto
	 */
	
	/*
		public interface Function<T, R> {
			public R aplly(T t);
		}
	*/
	
	//
	// BiFunction : espera 2 objetos como parametro e retorna um terceiro
	//
	
	/*
		public interface BiFunction<T, V, R> {
			public R aplly(T t, V v);
		}
	 */
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Function<Person, Integer> ageMapper = person -> person.getAge();
		// ou
		Function<Person, Integer> ageMapper2 = Person::getAge;
		
		UnaryOperator<Integer> uo = myint -> myint + 1;
		BinaryOperator<String> bo = (s1, s2) -> s1.concat(s2);
		
	}
	
	//
	// UnaryOperator e BinaryOperator sao interfaces funcionais que extendem Function e BiFunction respectivamente.
	//
	
	// UnaryOperator : espera como parametro um objeto e retorna o mesmo tipo de objeto
	// BinaryOperator : espera como parametro 2 objetos e retorna o mesmo tipo de objeto
	
	
}
