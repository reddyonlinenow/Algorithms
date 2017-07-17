package com.paritas.interview.prg;

public class StringReverse {

	public static void main(String[] args) {
		String str = "kjjkj I am Rajeswara Reddy";
		String reverseStr = reverseString(str); 
		System.out.println(reverseStr);
		String reverseChars = reverseCharString(str);
		System.out.println(reverseChars);
	}

	private static String reverseCharString(String str) {
		System.out.println(str.toCharArray());
		char[] chars = str.toCharArray();
		int i =0;
		int j = chars.length-1;
		while (i < j){
			swap(chars, i, j);
			i++;
			j--;
		}
		return new String(chars);
	}

	private static char[] swap(char[] str, int i, int j) {
		char temp = str[i];
		str[i] = str[j];
		str[j] = temp;
		return str;
	}
	
	private static String reverseString(String str) {
		String targetString = new String();
		if (str!=null){
			String [] splitStr = str.split(" ");
			
			for(int c = splitStr.length-1; c >= 0 ; c-- ) {
				System.out.println(splitStr[c]);
				targetString= targetString.concat(" " +splitStr[c]);
			}
		}
		return targetString;
	}

}
