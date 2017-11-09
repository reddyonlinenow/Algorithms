package com.paritas.interview.prg;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {

		int n = 10;
		Map<Double, Integer[]> map = new HashMap<Double, Integer[]>();
		int a=1, b=1, c=1, d = 1;
		for ( a=1 ; a < n; a++) {
			for (b=1; b < n; b++) {
				double result = Math.pow(a, 3) + Math.pow(b, 3);
				map.put(result, new Integer[] { a, b });
			}
		}
		for (c=1; c < n; c++) {
			for (d=1; d < n; d++) {
				double result = Math.pow(c, 3) + Math.pow(c, 3);
				Integer[] output = map.get(result);
				System.out.println(result);
				System.out.println(printArray(output));

			}
		}
	}

	private static String printArray(Integer[] anArray) {
		StringBuilder sb = new StringBuilder();
		if (anArray == null) {
			return null;
		}
		for (int i = 0; i < anArray.length; i++) {
			if (i > 0) {
				sb.append(", ");
			}
			sb.append(anArray[i]);
		}
		// System.out.println(sb.toString());
		return sb.toString();
	}

}
