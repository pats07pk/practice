package com.practice.comparable;

public class Movie implements Comparable<Movie> {

	private String name;
	private int year;
	private double rating;

	
	public Movie(String name, int year, double rating) {
		super();
		this.name = name;
		this.year = year;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public int compareTo(Movie movie) {
		return movie.year - this.year; 
	}

	@Override
	public String toString() {
		return String.format("Movie [name=%s, year=%s, rating=%s]", name, year, rating);
	}
	
	
}
