package com.paritas.interview.prg;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1Excercise {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Raj", "Reddy", 32), new Person("Rithu", "DS", 28),
				new Person("Vijaya", "Bhaskar", 62), new Person("Shakunthala", "Valishekkagari", 55));
		
		System.out.println("Print ALL ");
		printCondition(people, p -> true);
		System.out.println("Sort All");
		sortPeople(people);
		printAll(people);
		System.out.println("Reverse Sort");
		reverseSort(people);
		printAll(people);

		System.out.println("LastName with R using Condition ");
		printCondition(people, p -> p.getLastName().startsWith("R"));
		System.out.println("FirstName with V using Predicate ");
		printPredicate(people, p -> p.getFirstName().startsWith("V"));
		System.out.println("Print with Consumer  ");
		printConsumer(people, p -> p.getLastName().startsWith("R"), p -> System.out.println(p.getLastName()));
	}

	private static void printConsumer(List<Person> people, Predicate<Person> pred, Consumer<Person> cons) {
		// TODO Auto-generated method stub
		for (Person person : people) {
			if (pred.test(person))
				cons.accept(person);
		}
	}

	private static void printPredicate(List<Person> people, Predicate<Person> pred) {
		// TODO Auto-generated method stub
		for (Person person : people) {
			if (pred.test(person))
				System.out.println(person);
		}
	}

	private static void printCondition(List<Person> people, Condition con) {
		// TODO Auto-generated method stub
		for (Person person : people) {
			if (con.test(person))
				System.out.println(person);
		}
	}

	private static void reverseSort(List<Person> people) {
		// sort using Lambda
		Collections.sort(people, (p1, p2) -> p2.getLastName().compareTo(p1.getLastName()));
	}

	private static void sortPeople(List<Person> people) {
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
	}

	private static void printAll(List<Person> people) {
		for (Person person : people) {
			System.out.println(person);
		}

	}
}

interface Condition {
	boolean test(Person p);
}
