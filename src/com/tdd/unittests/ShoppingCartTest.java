package com.tdd.unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tdd.tddsource.Movie;
import com.tdd.tddsource.Rental;
import com.tdd.tddsource.ShoppingCart;

public class ShoppingCartTest {

	final static int NEW_RELEASE = 0;
	final static int CHILDREN_MOVIE = 1;
	final static int REGULAR_MOVIE = 2;
	
	@Test
	public void testAdd() {

		//ShoppingCartTest to test adding movies to the shopping cart
		Movie movie = new Movie("Matrix",REGULAR_MOVIE,3.0);
		Movie movie2 = new Movie("Finding Nemo",CHILDREN_MOVIE,3.0);
		Movie movie3 = new Movie("Star Wars: The Force Awakens",NEW_RELEASE,7.5);
		Rental r = new Rental(movie,2);
		Rental r2 = new Rental(movie2,5);
		Rental r3 = new Rental(movie3,4);
		ShoppingCart sc = new ShoppingCart();
		
		assertTrue(sc.add(r));
		assertFalse(sc.add(r));
		assertTrue(sc.add(r2));
		assertTrue(sc.add(r3));		
		
	}
	
	@Test
	public void testRemove() {

		//ShoppingCartTest to test removing movies from shopping cart
		Movie movie = new Movie("Matrix",REGULAR_MOVIE,3.0);
		Rental r = new Rental(movie,2);
		ShoppingCart sc = new ShoppingCart();
		
		assertFalse(sc.remove(r));
		sc.add(r);
		assertTrue(sc.remove(r));
	}
	
	@Test
	public void testPriceAndPoint() {

		//ShoppingCartTest to test for total price and points of a shopping cart
		Movie movie = new Movie("Matrix",REGULAR_MOVIE,3.0);
		Movie movie2 = new Movie("Finding Nemo",CHILDREN_MOVIE,3.0);
		Movie movie3 = new Movie("Star Wars: The Force Awakens",NEW_RELEASE,7.5);
		Rental r = new Rental(movie,2);
		Rental r2 = new Rental(movie2,5);
		Rental r3 = new Rental(movie3,4);
		ShoppingCart sc = new ShoppingCart();
		
		sc.add(r);
		assertEquals(6.0,sc.getTotalPrice(),0.01);
		assertEquals(1.2,sc.getTotalPoints(),0.01);
		sc.add(r2);
		assertEquals(18.0,sc.getTotalPrice(),0.01);
		assertEquals(4.8,sc.getTotalPoints(),0.01);
		sc.add(r3);
		assertEquals(48.0,sc.getTotalPrice(),0.01);
		assertEquals(7.8,sc.getTotalPoints(),0.01);
	}

}
