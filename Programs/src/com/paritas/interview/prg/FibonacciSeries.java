package com.paritas.interview.prg;

public class FibonacciSeries {

	public static void main(String[] args) {

		finbonacci(10);
	}

	private static void finbonacci(int i) {
		for (int j = 0; j < i; j++) {
			System.out.println(getFibonacci(j) + " ");
		}
		
	}

	private static int getFibonacci(int num) {
		int nth = 1;
		int first = 0;
		int second = 1;
		
		if(num == 0 || num == 1) {
			return num;
		} 
		for(int i =2; i <=num ; i++){
//			System.out.println(first);
//			System.out.println(second);
			nth = first + second;
			first = second;
			second = nth;
		}
		
		
		return nth;
	}

}
