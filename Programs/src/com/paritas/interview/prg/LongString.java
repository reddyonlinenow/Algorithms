package com.paritas.interview.prg;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String s = "abcdefghijklmnopqrstuvwxyz1234567890a";
		String s = "abcdefa";
		char[] ch = s.toCharArray();
		// String finalString = "" + ch[0];
		int seq = 0;
		for (int i = 1; i < ch.length; i++) {
			if (ch[0] == ch[i]) {
				seq = i;
				break;
			}
			// finalString = finalString + ch[i];
		}
		System.out.println(s.subSequence(0, seq));
		s = "abaacde";
		int n = s.length(), ans = 0;
		 Map<Character, Integer> map = new HashMap<>(); // current index of character
	        // try to extend the range [i, j]
	        for (int j = 0, i = 0; j < n; j++) {
	            if (map.containsKey(s.charAt(j))) {
	                i = Math.max(map.get(s.charAt(j)), i);
	            }
	            ans = Math.max(ans, j - i + 1);
	            map.put(s.charAt(j), j + 1);
	        }
	        System.out.println(map.keySet());
	}

}
