package com.pluralsight.collections2streamsusinglambda.collectionsapi.iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Novos metodos foram adicionados como por exemplo:
 * 	- boolean foreach(Consumer<? super E> consumer);
 * 	- boolean removeIf(Predicate<? super E> filter);
 *
 */
public class CollectionAndIterableNewMethods {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>(Arrays.asList("joao", "mateus", "luCas", "ana", "junior", "jaca", "ricardo silva"));
		names.forEach(System.out::println);
		
		names.removeIf(nome -> nome.length() > 6);
		
		//
		// em List
		//
		
		//	boolean replaceAll(UnaryOperator<? super E> operator);
		names.replaceAll(nome -> nome.toUpperCase());
		// ou
		names.replaceAll(String::toUpperCase);
		
		System.out.println("\nComparing only length");
		names.sort(Comparator.comparing(String::length));
		names.forEach(System.out::println);
		
		// boolean sort(Comparator<? super E> comparator);
		names.sort(Comparator.comparing(String::length).thenComparing((s1, s2) -> s1.compareTo(s2)));
		
		System.out.println("\nComparing length AND lexicografic");
		names.forEach(System.out::println);
		
	}
	
}
