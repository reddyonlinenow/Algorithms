package com.paritas.interview.prg;

public class LambdaExample {

	public static void main(String[] args) {

		MyLambda ds = () -> System.out.println("Hello World");
		AddLambda addFunction = (int a, int b) -> a + b;
		DLambda divideFunction = (int c, int d) -> {
			if (d == 0)
				return 0;
			return c / d;
		};
		StringLen stringlen = (String s) -> s.length();
		ds.foo();
		System.out.println(addFunction.add(10, 20));
		System.out.println(divideFunction.divide(20, 10));
		System.out.println(stringlen.stringLength("Hi How are you"));

	}

}

interface MyLambda {
	void foo();
}

interface AddLambda {
	int add(int a, int b);
}

interface DLambda {
	int divide(int a, int b);
}

interface StringLen {
	int stringLength(String s);
}
