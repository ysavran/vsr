package com.tdd.tddsource;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	private String first_name;
	private String last_name;
	private double advantage_points;
	private List<ShoppingCart> cart_list;
	
	//Constructor Method
	public Customer(String first_name, String last_name) {
		this.first_name = first_name;
		this.last_name = last_name;
		advantage_points = 0;
		cart_list = new ArrayList<ShoppingCart>();
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public double getAdvantagePoints() {
		return advantage_points;
	}

	public void setAdvantagePoints(double advantage_points) {
		this.advantage_points = advantage_points;
	}

	//Handles payment for a shopping cart
	//If payment is done, adds shopping cart to customer
	public boolean checkout(ShoppingCart sc, double payment_amount) {
		if(payment_amount>=sc.getTotalPrice()){
			addAdvantagePoints(sc.getTotalPoints());
			
			return true;
		}
		else{
			if(payment_amount+this.advantage_points >= sc.getTotalPrice()) {
				advantage_points = advantage_points - (sc.getTotalPrice() - payment_amount);
				addAdvantagePoints(sc.getTotalPoints());		
				return true;
			}
			else{
				return false;
			}
		}
	}

	//Adds points to customer
	private void addAdvantagePoints(double points) {
		advantage_points += points;
	}

}