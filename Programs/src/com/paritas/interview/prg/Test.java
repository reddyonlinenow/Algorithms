package com.paritas.interview.prg;

public class Test {
	public static void main(String[] args) {
		usingRecursive(100);
	}

	private static void usingRecursive(int i) {
		if (i > 1) {
			usingRecursive(i - 1);
		}
		System.out.println(i);
	}
}