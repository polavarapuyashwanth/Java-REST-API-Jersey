package com.yaswanth.REST_API;

import java.util.ArrayList;
import java.util.List;

public class MarvelRepository {
	
    private List<Marvel> movieList = new ArrayList<>();
	
	public void addMarvel(String marvelMovie, double imdbRating, String releaseDate) {
		Marvel obj = new Marvel();

		obj.setMarvelMovie(marvelMovie);
		obj.setRating(imdbRating);
		obj.setReleaseDate(releaseDate);
		
		this.movieList.add(obj);
	}
	
	
	public List<Marvel> getMovies(){
		System.out.println("Get Marvel called... ");
		addMarvel("Iron Man",7.9,"1 May 2008");
		addMarvel("Avengers Infinity War",8.9,"7 May 2018");
		
		return this.movieList;
	}
	
	public Marvel getMovie(String name) {
		name = name.toLowerCase().replaceAll("\\s", "");
	    for(Marvel i : movieList) {
	    	String temp = i.getName().toLowerCase().replaceAll("\\s","");
	    	if(name.equals(temp))
	    		return i;
	    }
	    return new Marvel();
	}
}
