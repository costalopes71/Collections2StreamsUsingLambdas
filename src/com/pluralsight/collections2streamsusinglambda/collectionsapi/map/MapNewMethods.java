package com.pluralsight.collections2streamsusinglambda.collectionsapi.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Novos metodos na interface Map. Alguns exemplo:
 * 	- boolean foreach(BiConsumer<? super K, ? super V> consumer);
 * - getOrDefault(Object key, V defaultValue);
 */
public class MapNewMethods {

	
	// MEHTOD: getOrDefault
	// no metodo get normal se a chave nao estiver no mapa retornara null, e nao poderemos saber se a chave nao esta presente ou se esta associada a um valor
	// nulo
	
	//METHOD: putIfAbsent(K key, V value);
	// ira por o valor no mapa APENAS se a chave NAO estiver presente no mapa (o metodo retorna o valor anterior)
	
	// METHOD: V replace(K key, V newValue); troca o valor no mapa APENAS se a chave existir
	// boolean replace(K key, V existingValue, V newValue); troca o valor no mapa APENAS se o valor antigo for o mesmo que foi passado por parametro
	
	//METHOD: void replaceAll(BiFunction<? super K, ? super V, ? extends V> function);
	// troca todos os valores do mapa
	
	//METHOD: boolean remove(key, value); remove a chave e o valor APENAS se o valor passado como parametro for igual ao valor presente na chave
	
	//
	// METHOD COMPUTE*
	//
	
	/*
		os metodos compute retornam o valor e isso eh bom pois podemos usar de forma a nos ajudar a construir nosso mapa de maneira mais simples. Exemplos
		no metodo main
	 */
	
	//
	// METHOD MERGE 
	//
	
	public static void main(String[] args) {
		
		Map<String, List<Integer>> map = new HashMap<>();
		
		map.replaceAll((key, value) -> new ArrayList<Integer>());
		
		//
		// compute examples
		//
		Map<String, List<Integer>> map2 = new HashMap<>();
		
		String[] aux = {"one", "two", "three", "four", "five", "six"};
		
		int i = 0;
		while (i < 100) {
			for (String key : aux) {
				map2.computeIfAbsent(key, k -> new ArrayList<>()).add(i++);
			}
		}
		
		map2.forEach((key, value) -> System.out.println(key + " -> " + value));
		
		//
		// MERGE example
		//
		i = 50;
		while (i < 150) {
			for (String key : aux) {
//				map.putIfAbsent(key, new ArrayList<>()).add(i++);
				map.computeIfAbsent(key, k -> new ArrayList<>()).add(i++);
			}
		}

		// fazendo o merging dos 2 mapas 
		map.forEach((key, value) -> {
			
			map2.merge(key, map.get(key), (oldValue, newValue) -> {
				oldValue.addAll(newValue);
				return oldValue;
			});
			
		});
		
		System.out.println("\nMerged map");
		// imprimindo o merge
		map2.forEach((key, value) -> {
			value.sort((x, y) -> Integer.compare(x, y));
			System.out.println(key + " -> " + value);
		});
		
	}
	
	
}