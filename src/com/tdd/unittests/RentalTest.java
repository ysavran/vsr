package com.tdd.unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tdd.tddsource.*;

public class RentalTest {

	final static int NEW_RELEASE = 0;
	final static int CHILDREN_MOVIE = 1;
	final static int REGULAR_MOVIE = 2;
	
	@Test
	public void test() {

		//RentalTest to test pricing of each rental
		Movie movie = new Movie("Matrix",REGULAR_MOVIE,3.0);
		Movie movie2 = new Movie("Finding Nemo",CHILDREN_MOVIE,3.0);
		Movie movie3 = new Movie("Star Wars: The Force Awakens",NEW_RELEASE,7.5);
		Rental r = new Rental(movie,5);
		Rental r2 = new Rental(movie2,4);
		Rental r3 = new Rental(movie3,9);
		
		assertEquals(12.0,r.getPrice(),0.01);
		assertEquals(9.0,r2.getPrice(),0.01);
		assertEquals(60.0,r3.getPrice(),0.01);
		
	}

}
