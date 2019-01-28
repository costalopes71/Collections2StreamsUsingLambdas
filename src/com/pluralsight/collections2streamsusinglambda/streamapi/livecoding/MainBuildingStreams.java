package com.pluralsight.collections2streamsusinglambda.streamapi.livecoding;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainBuildingStreams {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// patterns para construir streams
		
		List<Integer> ints = Arrays.asList(0, 1, 2, 3, 4);
		
		Stream<Integer> stream1 = ints.stream();
		
		Stream<Integer> stream = Stream.of(0, 1, 2, 3, 4);
		
		stream.forEach(System.out::println);
		
		// com generate e limitando a 5 elementos
		
		Stream<String> generatedStream = Stream.generate(() -> "generated =)");
		generatedStream.limit(5).forEach(System.out::println);
		
		//com iterate limitando para 5 elementos
		
		Stream<String> iterate = Stream.iterate("=", s -> s + "=");
		iterate.limit(10).forEach(System.out::println);

		//com ThreadLocalRandom limitando para 5 elementos
		IntStream streamOfInts = ThreadLocalRandom.current().ints();
		streamOfInts.limit(5).forEach(System.out::println);
		
	}
	
}
