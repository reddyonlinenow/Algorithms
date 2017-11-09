package com.paritas.interview.prg;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 123;
		int b = -321;
		ReverseInteger ri = new ReverseInteger();
		ri.reverseInteger(123);
		ri.reverseInteger(-321);
	}

	private static void reverseInteger(int input) {
		// TODO Auto-generated method stub
		int output = 0;
		while (input != 0) {
			output = output * 10 + input % 10;
			input = input / 10;
		}
		System.out.println(output);
	}
}
