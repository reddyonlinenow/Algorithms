package com.paritas.interview.prg;

public class MthodReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(() -> printmessage());
		t.start();
		Thread t1 = new Thread(MthodReferenceExample::printmessage);
		t1.start();
	}

	private static void printmessage() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

}
