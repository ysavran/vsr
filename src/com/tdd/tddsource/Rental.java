package com.tdd.tddsource;

//Class for handling instance of rented movie
public class Rental {
	
	private Movie movie;
	private int days_rented;
	private double price;
	private double points;

	//Constructor Method
	public Rental(Movie movie, int days_rented) {
		this.movie = movie;
		this.days_rented = days_rented;
		this.price = movie.getPrice(days_rented); //Sets its price from Movie class based on days
		this.points = movie.getPoint(days_rented); //Sets its points from Movie class based on days
	}

	public double getPoints() {
		return points;
	}

	public void setPoints(double points) {
		this.points = points;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	public int getDays_rented() {
		return days_rented;
	}

	public void setDays_rented(int days_rented) {
		this.days_rented = days_rented;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}