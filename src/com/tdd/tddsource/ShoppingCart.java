package com.tdd.tddsource;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Rental> rental_list;
	private double total_price;
	private double total_points;

	//Constructor Method
	public ShoppingCart() {
		this.rental_list = new ArrayList<Rental>();
		this.total_price = 0;
		this.total_points = 0;
	}
	
	public double getTotalPrice() {
		return total_price;
	}

	public void setTotalPrice(double total_price) {
		this.total_price = total_price;
	}

	public double getTotalPoints() {
		return total_points;
	}

	public void setTotalPoints(double total_points) {
		this.total_points = total_points;
	}	

	//Trys to add a rental to the shopping cart
	//If success, updates total_price and total_points
	public boolean add(Rental r) {
		for(Rental rental:rental_list){
			if(rental==r)
				return false;
		}
		rental_list.add(r);
		total_price += r.getPrice();
		total_points += r.getPoints();
		return true;
		
	}

	//Trys to remove a rental from the shopping cart
	//If success, updates total_price and total_points
	public boolean remove(Rental r) {
		for(Rental rental:rental_list){
			if(rental==r){
				total_price = total_price - r.getPrice();
				total_points = total_points - r.getPoints();
				return true;
			}
		}
		return false;
	}
}
