package com.pluralsight.collections2streamsusinglambda.streamapi.limitingthestream;

import java.util.ArrayList;
import java.util.List;

public class LimitingTheRangeOfTheStream {

	public static void main(String[] args) {
		
		List<String> frases = new ArrayList<>();
		frases.add("1º frase do stream.");
		frases.add("2º frase do stream.");
		frases.add("3º frase do stream.");
		frases.add("4º frase do stream."); // dentro do limite
		frases.add("5º frase do stream");  // dentro do limite
		frases.add("6º frase do stream."); // dentro do limite
		frases.add("7º frase do stream."); // dentro do limite
		frases.add("8º frase do stream");  // dentro do limite
		frases.add("9º frase do stream.");
		frases.add("10º frase do stream.");
		
		frases.stream()
			.skip(3) // pula os 3 primeiros elementos!
			.limit(5) // limita o stream a 5 elementos
			.filter(frase -> frase.endsWith(".")) // filtra
			.forEach(System.out::println); // imprime
		
	}
	
}
