package com.tdd.unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tdd.tddsource.Customer;
import com.tdd.tddsource.Movie;
import com.tdd.tddsource.Rental;
import com.tdd.tddsource.ShoppingCart;

public class CustomerTest {
	
	final static int NEW_RELEASE = 0;
	final static int CHILDREN_MOVIE = 1;
	final static int REGULAR_MOVIE = 2;

	@Test
	public void test() {

		//CustomerTest case to test checking out and calculating advantage points 
		Customer c = new Customer("Fatih","Deniz");
		ShoppingCart sc = new ShoppingCart();
		ShoppingCart sc2 = new ShoppingCart();
		Movie movie = new Movie("Matrix",REGULAR_MOVIE,3.0);
		Movie movie2 = new Movie("Finding Nemo",CHILDREN_MOVIE,3.0);
		Movie movie3 = new Movie("Star Wars: The Force Awakens",NEW_RELEASE,7.5);
		Rental r = new Rental(movie,5);
		Rental r2 = new Rental(movie2,4);
		Rental r3 = new Rental(movie3,6);
		
		sc.add(r);
		sc.add(r2);		
		
		assertTrue(c.checkout(sc,21));
		assertEquals(5.1,c.getAdvantagePoints(),0.01);
		
		sc2.add(r3);
		
		assertFalse(c.checkout(sc2, 20));
		assertTrue(c.checkout(sc2, 40));
		assertEquals(4.6,c.getAdvantagePoints(),0.01);
		
	}

}
