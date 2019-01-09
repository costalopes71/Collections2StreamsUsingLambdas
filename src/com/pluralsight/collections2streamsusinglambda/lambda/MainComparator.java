package com.pluralsight.collections2streamsusinglambda.lambda;

import java.util.function.Function;

import com.pluralsight.collections2streamsusinglambda.lambda.model.Person;

public class MainComparator {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Comparator<Person> ageCmp = (p1, p2) -> p2.getAge() - p1.getAge();
		Comparator<Person> firstNameCmp = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());
		Comparator<Person> lastNameCmp = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());
		
		Function<Person, Integer> f1 = p -> p.getAge();
		Function<Person, String> f2 = p -> p.getFirstName();
		Function<Person, String> f3 = p -> p.getLastName();
		
		Comparator<Person> cmpPerson = Comparator.comparing(Person::getAge);
		// ou
		Comparator<Person> cmpPerson3 = Comparator.comparing(p -> p.getAge());
		
		Comparator<Person> chainedCmp = cmpPerson.thenComparing(cmpPerson3);
		
		Comparator<Person> lotsOfChainCmp = Comparator.comparing(Person::getLastName)
														.thenComparing(Person::getFirstName)
														.thenComparing(Person::getAge);
		
	}
	
}