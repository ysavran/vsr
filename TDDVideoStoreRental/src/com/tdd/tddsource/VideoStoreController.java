package com.tdd.tddsource;

//Controller class for mapping of system tasks
public class VideoStoreController {
	
	private MovieCatalog mc;
	
	//Constructor Method
	public VideoStoreController() {
		mc = new MovieCatalog();
		//
	}
	
	public ShoppingCart createNewShoppingCart() {
		return new ShoppingCart();
	}
	
	public Rental createNewRental(Movie movie,int days_rented) {
		return new Rental(movie,days_rented);
	}
	
	public boolean addRentalToShoppingCart(ShoppingCart sc, Rental r) {
		return sc.add(r);
	}
	
	public boolean removeRentalFromShoppingCart(ShoppingCart sc, Rental r) {
		return sc.remove(r);
	}
	
	public String customerCheckout(Customer c, ShoppingCart sc, double payment_amount){
		if(c.checkout(sc, payment_amount))
			return "Checkout successful.\n You have" + c.getAdvantagePoints() + "points.";
		else
			return "Checkout unsuccessful.";
	}
	
	public Customer createNewCustomer(String first_name, String last_name) {
		return new Customer(first_name,last_name);
	}
	
	public Movie createNewMovie(String name, int movie_type, double price_factor) {
		return new Movie(name,movie_type,price_factor);
	}
	
	public boolean addMovieToMovieCatalog(Movie movie) {
		return mc.add(movie);
	}
	
	public boolean removeMovieFromMovieCatalog(Movie movie) {
		return mc.remove(movie);
	}
	
	public Movie getMovieFromCatalogByName(String movie_name) {
		return mc.getMovieByName(movie_name);
	}
}
