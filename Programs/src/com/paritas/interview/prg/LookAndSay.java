package com.paritas.interview.prg;

import java.io.*;
import java.util.*;
//import com.google.common.collect.Lists;

/*
 * OBJECTIVE: Implement the 'look and say' function. 
 * 'Look and say' takes an input list and outputs a 
 * list that describes the count of the elements in 
 * the input list as they appear in order.
 * 
 * Example:
 * 
 * there is one '1' in the input list
 * lookAndSay([1]) == [[1, 1]]
 * 
 * there are two '1's in the input list
 * lookAndSay([1, 1]) == [[2, 1]]
 * 
 * there is one '2', followed by one '1' in 
 * the input list
 * lookAndSay([2, 1]) == [[1, 2], [1, 1]]
 * 
 * there is one '1', followed by one '2', 
 * followed by 2 '1's in the input list
 * lookAndSay([1, 2, 1, 1]) == [[1, 1], [1, 2], [2, 1]]
 *
 */

public class LookAndSay {
	public static void main(String[] args) {
		List<Integer> simpleList = Arrays.asList(4);
		List<Integer> longerList = Arrays.asList(1, 1, 2, 1);

		String simpleOutput = lookAndSay(simpleList).toString();
		if (simpleOutput.equals("[[1, 4]]")) {
			System.out.println("PASSED SIMPLE LIST");
		} else {
			System.out.println("FAILED SIMPLE LIST: " + simpleOutput);
		}

		String longerOutput = lookAndSay(longerList).toString();
		if (longerOutput.equals("[[2, 1], [1, 2], [1, 1]]")) {
			System.out.println("PASSED LONGER LIST");
		} else {
			System.out.println("FAILED LONGER LIST: " + longerOutput);
		}
	}

	public static List<List<Integer>> lookAndSay(List<Integer> inputList) {
		List<List<Integer>> outputList = new ArrayList<>();
		int i = 1, count = 1;
		List<Integer> innerList = null;
		
		if (inputList.size() < 0)
			return null; 
		if (inputList.size() > 1) {
			for (i = 1; i < inputList.size(); i++) {
				innerList = new ArrayList<Integer>();
				if (inputList.get(i) == inputList.get(i - 1)) {
					count++;
				} else {
					innerList.add(new Integer(count));
					innerList.add(new Integer(inputList.get(i - 1)));
					count = 1;
				}
				if (!innerList.isEmpty()) {
					outputList.add(innerList);
				}
			}
		}
		innerList = new ArrayList<Integer>();
		innerList.add(new Integer(count));
		innerList.add(new Integer(inputList.get(i - 1)));
		outputList.add(innerList);

		return outputList;
	}
}
