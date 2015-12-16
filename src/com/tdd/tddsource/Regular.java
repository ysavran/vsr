package com.tdd.tddsource;

//Implementation of MovieType Interface for handling pricing and calculating points for a Regular type movie
public class Regular implements MovieType {
	
	//A rate to calculate points that are awarded for renting Regular type movie
	static final double REGULAR_POINT_RATE = 0.2;
	
	public double getPrice(int days_rented, double price_factor) {
		if(days_rented>=5)
			return (days_rented - (days_rented/5))*price_factor;
		else
			return days_rented * price_factor;
	}

	public double getPoint(double price) {
		return price*REGULAR_POINT_RATE;
	}

}
