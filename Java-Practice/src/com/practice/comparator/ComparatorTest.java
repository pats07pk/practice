package com.practice.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.practice.comparable.Movie;

public class ComparatorTest {

	public static void main(String[] args) {

		Movie movie1 = new Movie("Predator", 1995, 4.0D);
		Movie movie2 = new Movie("Alien vs Predator", 2000, 4.0D);
		Movie movie3 = new Movie("Iron Man", 2008, 4.5D);
		Movie movie4 = new Movie("Jurassic Park", 1990, 5.0D);

		List<Movie> moviesList = new ArrayList<Movie>();
		moviesList.add(movie1);
		moviesList.add(movie4);
		moviesList.add(movie3);
		moviesList.add(movie2);

		Comparator<Movie> nameComparator = new Comparator<Movie>() {
			@Override
			public int compare(Movie m1, Movie m2) {
				return m1.getName().compareTo(m2.getName());
			}
		};

		Comparator<Movie> yearComparator = new Comparator<Movie>() {
			@Override
			public int compare(Movie m1, Movie m2) {
				return m1.getYear() - m2.getYear();
			}
		};

		System.out.println("Sorting by Name:  ");
		Collections.sort(moviesList, nameComparator);
		iterateList(moviesList);

		
		System.out.println("Sorting by Year:  ");
		Collections.sort(moviesList, yearComparator);
		iterateList(moviesList);
		
	}

	public static void iterateList(List list) {

		if (list.isEmpty()) {
			System.out.println("List is empty!!");
			return;
		}

		list.forEach(rec -> {
			System.out.println(rec);
		});

	}

}
