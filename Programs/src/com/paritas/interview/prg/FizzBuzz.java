package com.paritas.interview.prg;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFizzBuzz(10);
	}
	
	public static void printFizzBuzz(int i){
		for(int j= 0; j<=i; j++){
			if(j%3==0 && j%5==0){
				System.out.println("FizzBuzz");
			}
			else if(j%3==0){
				System.out.println("Fizz");
			}
			else if(j%5==0){
				System.out.println("Buzz");
			} else {
				System.out.println(j);
			}
			
		}
		// return i;
		
	}

}
