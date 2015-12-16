package com.tdd.unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tdd.tddsource.*;

public class MovieCatalogTest {

	final static int NEW_RELEASE = 0;
	final static int CHILDREN_MOVIE = 1;
	final static int REGULAR_MOVIE = 2;
	
	@Test
	public void test() {

		//MovieCatalogTest to test adding, removing movies and searching movies by name
		MovieCatalog mc = new MovieCatalog();
		Movie movie = new Movie("Matrix",REGULAR_MOVIE,3.0);
		
		Movie movie_to_be_removed = mc.getMovieByName("Matrix");
		
		assertEquals(false,mc.remove(movie_to_be_removed));
		assertEquals(true,mc.add(movie));
		assertEquals(false,mc.add(movie));
		
		movie_to_be_removed = mc.getMovieByName("Matrix");
		assertEquals(true,mc.remove(movie_to_be_removed));
		
	}

}
