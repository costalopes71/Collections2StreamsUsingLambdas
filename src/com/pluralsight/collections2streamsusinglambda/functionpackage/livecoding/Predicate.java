package com.pluralsight.collections2streamsusinglambda.functionpackage.livecoding;

@FunctionalInterface
public interface Predicate<T> {

	public boolean test(T t);

	default Predicate<T> and(Predicate<T> other) {
		return t -> test(t) && other.test(t);
	}

	default Predicate<T> or(Predicate<T> other) {
		return  t -> test(t) || other.test(t);
	}

	static <U> Predicate<U> isEqualTo(U t) {
		return obj -> obj.equals(t);
	}
	
}