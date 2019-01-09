package com.pluralsight.collections2streamsusinglambda.functionpackage;

import java.util.function.Supplier;

import com.pluralsight.collections2streamsusinglambda.lambda.model.Person;

public class TheSuppliers {

	/*
	 	Eh o contrario de um Consumer pois nao consome nenhum objeto (nao espera nenhum parametro) e retorna um objeto do tipo T.
	 */
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Supplier<Person> personSupplier = () -> new Person();
		// ou com method reference
		Supplier<Person> personSupplier2 = Person::new;
		
	}
	
}