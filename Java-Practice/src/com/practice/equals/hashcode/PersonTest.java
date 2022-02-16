package com.practice.equals.hashcode;

public class PersonTest {

	public static void main(String[] args) {
		
		Person person1 = new Person("Patit", "Pawan", 1234567);
		Person person2 = person1;
		Person person3 = new Person("Patit", "Pawan", 1234567);
		
		
		
		System.out.println(person1.equals(person2));
		System.out.println(person1.equals(person3));
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
		System.out.println(person3.hashCode());
		
		
	}
}
