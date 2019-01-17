package com.pluralsight.collections2streamsusinglambda.streamapi.firstpatterns;

import java.util.stream.Stream;

public class StreamBuilderPattern {

	public static void main(String[] args) {
		
		// Posso construir um stream pouco a pouco tbm, adicionando elementos a ele com o Builder
		Stream.Builder<String> builder = Stream.builder();
		
		// com add eu posso fazer esse chain de adds pq ele retorna o Builder, com accept serve para por elementos no stream mas como nao retorna o
		// builder nao posso fazer chain
		builder.add("one").add("two").add("three");
		builder.accept("four");
		
		Stream<String> builtStream = builder.build();
		builtStream.forEach(System.out::println);
		
	}
	
}
