package com.paritas.interview.prg;

import java.util.function.BiConsumer;

public class ExceptionLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 2, 3, 4 };
		int key = 0;
		// process(numbers, key, (v, k) -> System.out.println(v / k));
		process(numbers, key, wrapperLanbda((v, k) -> System.out.println(v / k)));
	}

	private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> biCons) {
		// TODO Auto-generated method stub
		for (int i : numbers) {
			biCons.accept(i, key);
		}
	}

	private static BiConsumer<Integer, Integer> wrapperLanbda(BiConsumer<Integer, Integer> biCons) {
		// TODO Auto-generated method stub
		return (v, k) -> {
			try {
				biCons.accept(v, k);
			} catch (Exception e) {
				System.out.println("Exception Caught");

			}

		};
	}

}
