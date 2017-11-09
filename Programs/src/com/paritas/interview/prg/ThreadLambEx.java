package com.paritas.interview.prg;

public class ThreadLambEx {

	public static void main(String[] args) {
		Thread thr = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Print Runnable");

			}
		});
		thr.run();

		Thread th = new Thread(() -> System.out.println("print using lambda run"));
		th.run();
	}

}
