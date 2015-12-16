package com.tdd.tddsource;

//Implementation of MovieType Interface for handling pricing and calculating points for a New Release type movie
public class NewRelease implements MovieType {
	
	//A rate to calculate points that are awarded for renting New Release type movie
	static final double NEWRELEASE_POINT_RATE = 0.1;
	
	public double getPrice(int days_rented, double price_factor) {
		
		if(days_rented>=7)
			return (days_rented - (days_rented/7))*price_factor;
		else
			return days_rented * price_factor;
	}

	public double getPoint(double price) {
		return price*NEWRELEASE_POINT_RATE;
	}

}
