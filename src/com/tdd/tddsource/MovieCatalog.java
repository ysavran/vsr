package com.tdd.tddsource;

import java.util.ArrayList;
import java.util.List;


public class MovieCatalog {
	
	private List<Movie> movie_list;

	//Constructor Method
	public MovieCatalog() {
		this.movie_list = new ArrayList<Movie>();
	}

	//Adding a new movie to the movie catalog
	//returns true if the movie is added
	//returns false if the movie is already in the catalog
	public boolean add(Movie movie) {
		for(Movie m:movie_list){
			if(m.getName()==movie.getName())
				return false;
		}
		return movie_list.add(movie);
	}

	//Removing a movie from the movie catalog
	//returns true if movie is removed
	//returns false if movie can not be find
	public boolean remove(Movie movie) {
		return movie_list.remove(movie);
	}

	//Searching movie catalog for a specific move based on its name and returns it
	//Returns null if no movie is matched
	public Movie getMovieByName(String name) {
		for(Movie m:movie_list){
			if(m.getName()==name)
				return m;
		}
		return null;
	}
	
}
