package com.tdd.tddsource;

//Implementation of MovieType Interface for handling pricing and calculating points for a Children type movie
public class Children implements MovieType {
	
	//A rate to calculate points that are awarded for renting Children type movie
	static final double CHILDREN_POINT_RATE = 0.3;
	
	public double getPrice(int days_rented, double price_factor) {
		if(days_rented>=3)
			return (days_rented - (days_rented/3))*price_factor;
		else
			return days_rented * price_factor;
	}
	
	public double getPoint(double price) {
		return price*CHILDREN_POINT_RATE;
	}

}
