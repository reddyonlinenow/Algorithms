package com.paritas.interview.prg;

public class Palindrome {

	public static void main(String[] args) {

		String str = new String("this is reverse string");
		String reverseStr = reverse(str);
		System.out.println(reverseStr);
	}

	private static String reverse(String str) {
		StringBuffer sb = new StringBuffer();
		char[] chars = str.toCharArray();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(chars[i]);
		}
		return sb.toString();
	}
}
