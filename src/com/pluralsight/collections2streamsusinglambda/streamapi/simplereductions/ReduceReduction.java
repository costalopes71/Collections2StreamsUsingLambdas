package com.pluralsight.collections2streamsusinglambda.streamapi.simplereductions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.pluralsight.collections2streamsusinglambda.collectionsapi.livecoding.Person;

public class ReduceReduction {

	// 3 tipos de reducoes do tipo Reduce
	
	
	
	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(1, 3, 43, 64, 77, 34, 6, 87, 354, 25, 75, 8, 86, 888, 4);
		
		// 1 - provendo o elemento de identidade, retorna o tipo da reducao
		int reduceWithIdentityElement = intList.stream()
				.reduce(0, (x, y) -> x + y);
		System.out.println("Reducao com elemento de identidade -> " + reduceWithIdentityElement);
		
		// 2 - sem prover o elemento de identidade, um Optional eh retornado
		Optional<Integer> reduceWithNoIdentityElement = intList.stream()
				.reduce(Integer::max);
		System.out.println("Reducao sem elemento de identidade -> " + reduceWithNoIdentityElement.get());
		
		// 3 - usado para operacoes em paralelo
		List<Person> people = new ArrayList<>();
		people.add(new Person("Joao", 31));
		people.add(new Person("Leonardo", 30));
		people.add(new Person("Karina", 34));
		people.add(new Person("Ana", 22));
		people.add(new Person("Leticia", 20));
		people.add(new Person("Daniel", 25));
		
		
		ArrayList<Integer> reduceList = people.stream()
			.reduce(new ArrayList<Integer>(),
				(list, p) -> {
					list.add(p.getAge());
					return list;
			},
			(list1, list2) -> {
				list1.addAll(list2);
				return list1;
			});
		
		System.out.println("Reduce em paralelo");
		reduceList.forEach(System.out::println);
		
		System.out.println("teste");
		people.stream().map(Person::getAge).forEach(System.out::println);;
		
	}
	
	
}
