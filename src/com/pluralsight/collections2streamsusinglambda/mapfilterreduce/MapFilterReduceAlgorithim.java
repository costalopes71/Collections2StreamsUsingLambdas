package com.pluralsight.collections2streamsusinglambda.mapfilterreduce;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.collections2streamsusinglambda.collectionsapi.livecoding.Person;

public class MapFilterReduceAlgorithim {

	/* Aloritmo Map -> Filter -> Reduce
	 	MAP : pegar uma lista de um tipo e mapear para uma lista de outro tipo. O passo map nao muda o tamanho da lista!! Muda sim o tipo!
	 	FILTER : filtrar pega uma lista e filtra os elementos que nao obedecem o predicado. O passo filter nao muda o tipo da lista que processa, 
	 	muda sim o numero de elementos na lista, uma vez que esta filtrando os elementos que nao se encaixam no predicado.
	 	REDUCE : computa um valor dado ou um objeto dos elementos que ele pega como input. Muda completamente o tipo de retorno. (ex: agregacao sql)
	 */
	
	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();
		people.add(new Person("Joao", 30));
		people.add(new Person("Andre", 23));
		people.add(new Person("Mateus", 32));
		people.add(new Person("Ana", 58));
		people.add(new Person("Lucia", 42));
		people.add(new Person("Ricardo", 18));
		
		// Exemplo classico do algoritmo map, filter reduce. Calcular a media de idade das pessoas que tem mais de 20 anos
		
		// java 7 <
		int sum = 0;
		int count = 0;
		for (Person person : people) {
			
			if (person.getAge() > 20) {
				sum += person.getAge();
				count++;
			}
			
		}
		int average = 0;
		if (count > 0) {
			average = sum / count;
		}
		
		System.out.println("Java 7 <: " + average);
		
	}
	
}
