package com.practice.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
	
	public static void main(String[] args) {
		
		Movie movie1 = new Movie("Predator", 1995, 4.0D);
		Movie movie2 = new Movie("Alien vs Predator", 2000, 4.0D);
		Movie movie3 = new Movie("Iron Man", 2008, 4.5D);
		Movie movie4 = new Movie("Jurassic Park", 1990 , 5.0D);
		
		List<Movie> moviesList = new ArrayList<Movie>();
		moviesList.add(movie1);
		moviesList.add(movie4);
		moviesList.add(movie3);
		moviesList.add(movie2);
		
		System.out.println("Before sorting..");
		iterateList(moviesList);
		Collections.sort(moviesList);
		System.out.println("After sorting");
		iterateList(moviesList);
		
	} 

	
	public static void iterateList(List list) {
		
		if(list.isEmpty()) {
			System.out.println("List is empty!!");
			return ;
		}
		
		list.forEach(rec -> {
			System.out.println(rec);
		});
			
	}
	
}
