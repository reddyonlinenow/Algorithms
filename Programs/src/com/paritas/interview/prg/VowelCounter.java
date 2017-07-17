package com.paritas.interview.prg;

public class VowelCounter {
	public static void main(String args[]) {

		String input = " aeiou";
		char[] letters = input.toCharArray();
		int vowelCount = 0;
		int consonentCount = 0;
		for (char c : letters) {
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowelCount++;
				break;
			default:
				consonentCount++;
			}
		}
		System.out.println("Number of vowels in String [" + input + "] is : " + vowelCount);
		System.out.println("Number of Consonants in String [" + input + "] is : " + consonentCount);
	}
}