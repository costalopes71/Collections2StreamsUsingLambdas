package com.pluralsight.collections2streamsusinglambda.functionpackage;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/*
	 	Existem 43 interfaces funcionais no pacote java.function dividas em 4 categorias:
	 		- Consumers
	 		- Supplier
	 		- Functions
	 		- Predicates
 */
public class TheConsumers {

	// Um Consumer consome um objeto e nao retorna nada

	/* A interface tem o metodo abstrato accept
		 public interface Consumer<T> {
			
			public void accept(T t);
			
		}
	 */
	
	Consumer<String> printer = s -> System.out.println(s);
	// ou
	Consumer<String> printer2 = System.out::println; //method reference
	
	//
	// BiConsumer : consome 2 objetos ao inves de um
	//
	
	/*
	 	public interface BiCosumer<T, V> {
			public void accept(T t, V v);
		}
	 */
	
	public static void main(String[] args) {
		
		Consumer<String> printer = s -> System.out.println(s);
		printer.accept("Este eh um Consumer");
		
		BiConsumer<String, Integer> biprinter = (s, i) -> System.out.println("String = " + s + " and int=" + i);
		biprinter.accept("Joao", 30);
	}
	
}


