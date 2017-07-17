package com.paritas.interview.prg;

public class BinarySearch {

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 11, 13, 15, 16 };
		System.out.println("Binary Search Algorithm the array length: " + input.length);
		recursiveBinarySearch(input, 1);
	}

	private static int recursiveBinarySearch(int[] input, int target) {
		return binarySearch(input, 0, input.length - 1, target);
	}

	private static int binarySearch(int[] input, int start, int end, int target) {
		int middle = (start + end) / 2;
		System.out.println("target is " + target);
		System.out.println("start is " + start);
		System.out.println("middle is " + middle);
		System.out.println("end is " + end);
		if (end < start) {
			return -1;
		}
		if (target == input[middle]) {
			System.out.println("Found target element: " + input[middle]);
			return middle;
		} else if (target < input[middle]) {
			System.out.println("values are from start to middle: " + (middle - 1));
			return binarySearch(input, start, middle - 1, target);
		} else {
			System.out.println("values are from middle to end: " + (middle + 1));
			return binarySearch(input, middle + 1, end, target);
		}
	}
}
