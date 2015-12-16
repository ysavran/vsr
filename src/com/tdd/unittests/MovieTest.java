package com.tdd.unittests;


import static org.junit.Assert.*;

import org.junit.Test;

import com.tdd.tddsource.*;

public class MovieTest {

	final static int NEW_RELEASE = 0;
	final static int CHILDREN_MOVIE = 1;
	final static int REGULAR_MOVIE = 2;
	
	@Test
	public void test() {

		//MovieTest to test accessing movie attributes
		Movie movie = new Movie("Matrix",REGULAR_MOVIE,3.0);
		
		assertEquals("Matrix",movie.getName());
		assertEquals(3.0,movie.getPriceFactor(),0.01);
		
		Movie movie2 = new Movie("Finding Nemo",CHILDREN_MOVIE,3.0);
		
		assertEquals("Finding Nemo",movie2.getName());
		assertEquals(3.0,movie2.getPriceFactor(),0.01);
		
		Movie movie3 = new Movie("Star Wars: The Force Awakens",NEW_RELEASE,7.5);
		
		assertEquals("Star Wars: The Force Awakens",movie3.getName());
		assertEquals(7.5,movie3.getPriceFactor(),0.01);
		
	}
	@Test
	public void priceTest(){

		//MovieTest to test pricing that is made by MovieType Strategy Pattern
		Movie movie = new Movie("Matrix",REGULAR_MOVIE,3.0);
		Movie movie2 = new Movie("Finding Nemo",CHILDREN_MOVIE,3.0);
		Movie movie3 = new Movie("Star Wars: The Force Awakens",NEW_RELEASE,7.5);
		
		
		assertEquals(12,movie.getPrice(4),0.01);
		assertEquals(15,movie.getPrice(6),0.01);
		assertEquals(24,movie.getPrice(10),0.01);
		assertEquals(6,movie2.getPrice(2),0.01);
		assertEquals(12,movie2.getPrice(5),0.01);
		assertEquals(18,movie2.getPrice(9),0.01);
		assertEquals(37.5,movie3.getPrice(5),0.01);
		assertEquals(75,movie3.getPrice(11),0.01);
		assertEquals(105,movie3.getPrice(16),0.01);
		
	}
	
	@Test
	public void pointTest() {

		//MovieTest to test calculating points that is made by MovieType Strategy Pattern
		Movie movie = new Movie("Matrix",REGULAR_MOVIE,3.0);
		Movie movie2 = new Movie("Finding Nemo",CHILDREN_MOVIE,3.0);
		Movie movie3 = new Movie("Star Wars: The Force Awakens",NEW_RELEASE,7.5);
		
		assertEquals(2.4,movie.getPoint(4),0.01);
		assertEquals(3.0,movie.getPoint(6),0.01);
		assertEquals(1.8,movie2.getPoint(2),0.01);
		assertEquals(5.4,movie2.getPoint(9),0.01);
		assertEquals(7.5,movie3.getPoint(11),0.01);
		assertEquals(10.5,movie3.getPoint(16),0.01);
	}
}
