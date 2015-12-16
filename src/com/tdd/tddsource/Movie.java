package com.tdd.tddsource;

public class Movie {

	private final static int NEW_RELEASE = 0;
	private final static int CHILDREN_MOVIE = 1;
	private final static int REGULAR_MOVIE = 2;
	
	private String name;
	private MovieType type;
	private double price_factor;

	//Constructor Method
	public Movie(String name, int type, double price_factor) {
		this.setName(name);
		setType(type);
		this.setPriceFactor(price_factor);
	}

	//Creating a new MovieType Strategy based on a passed argument(type)
	private void setType(int type) {
		switch(type){
		case NEW_RELEASE:
			this.type=new NewRelease();
			break;
		case CHILDREN_MOVIE:
			this.type=new Children();
			break;
		case REGULAR_MOVIE:
			this.type=new Regular();
			break;
			
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MovieType getType() {
		return type;
	}

	public void setType(MovieType type) {
		this.type = type;
	}

	public double getPriceFactor() {
		return price_factor;
	}

	public void setPriceFactor(double price_factor) {
		this.price_factor = price_factor;
	}

	//Method that returns price of a movie by using MovieType Strategy Pattern
	public double getPrice(int days_rented) {
		return type.getPrice(days_rented, price_factor);
	}

	//Method that returns advantage points of a movie by using MovieType Strategy Pattern
	public double getPoint(int days_rented) {
		return type.getPoint(type.getPrice(days_rented, price_factor));
	}

}
