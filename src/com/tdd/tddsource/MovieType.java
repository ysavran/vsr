package com.tdd.tddsource;

//Strategy Pattern Interface for movie pricing and calculating points
public interface MovieType {
	
	public double getPrice(int days_rented, double price_factor);

	public double getPoint(double price);

}
