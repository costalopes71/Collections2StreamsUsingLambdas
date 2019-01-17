package com.pluralsight.collections2streamsusinglambda.streamapi.firstpatterns;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstPatterns {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*
		List<String> lista = new ArrayList<>();
		
		// constroi um stream sobre a lista
		Stream<String> stream = lista.stream();
		
		// cria um Stream vazio
		Stream<Object> empty = Stream.empty();
		
		// constroi um stream em cima de um unico elemento
		Stream<String> of = Stream.of("one");
		
		// constroi um stream em cima de diversos elementos
		Stream.of("one", "two", "three");
		
		// um Stream constante -> gera um stream infinito usando o Supplier criado
		Stream<Double> generate = Stream.generate(() -> Math.random());
		generate.forEach(System.out::println);
		
		// um Stream que vai crescendo
		Stream<Long> iterate = Stream.iterate(1l, (x) -> x + x);
		iterate.forEach((x) -> {
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(x);
			
		});
		
		
		// retorna um Stream de ints infinito com numeros randomicos
		IntStream ints = ThreadLocalRandom.current().ints();
		ints.forEach(System.out::println);
		*/
		
		// 
		IntStream chars = "hello".chars();
		chars.forEach(System.out::println);
		
		// Stream do resultado da aplicacao de uma expressao regular
		String book = "This is a whole book of nothing";
		Stream<String> splitAsStream = Pattern.compile("[^\\p{javaLetter}]").splitAsStream(book);
		splitAsStream.forEach(System.out::println);
		
		// Stream contendo todas linhas de um arquivo
		Path path = Paths.get("C:/joao/joao.txt");
		Stream<String> lines = null;
		try {
			lines = Files.lines(path);
			lines.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			lines.close();
		}
		
		
	}
	
}
