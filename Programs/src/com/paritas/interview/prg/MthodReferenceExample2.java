package com.paritas.interview.prg;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MthodReferenceExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people = Arrays.asList(new Person("Raj", "Reddy", 32), new Person("Rithu", "DS", 28),
				new Person("Vijaya", "Bhaskar", 62), new Person("Shakunthala", "Valishekkagari", 55));

		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
		System.out.println();
		// for (Person person : people) {
		// System.out.println(person);
		// }

		people.forEach(System.out::println);

		System.out.println("Print with Consumer  ");

		printConsumer(people, p -> true, System.out::println);

		people.stream()
		.filter(p-> p.getFirstName().startsWith("R"))
		.forEach(p -> System.out.println(p.getFirstName()));
	}

	private static void printConsumer(List<Person> people, Predicate<Person> pred, Consumer<Person> cons) {
		// TODO Auto-generated method stub
		for (Person person : people) {
			if (pred.test(person))
				cons.accept(person);
		}
	}

}
