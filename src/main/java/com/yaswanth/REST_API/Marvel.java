package com.yaswanth.REST_API;

import  jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Marvel {
	private int id; // Just to track individual movies
	private int lastId; // To keep track of last id created;
    public String marvelMovie;
    private double imdbRating;
    private String releaseDate;
    
    Marvel() {
    	this.id = this.lastId + 1;
    	this.lastId = this.id;
    }
    
    public void setMarvelMovie(String marvelMovie) {
    	this.marvelMovie = marvelMovie;
    }
    
    public String getName() {
    	return this.marvelMovie;
    }
    
    public void setRating(double rating) {
    	this.imdbRating = rating;
    }
    
    public double getRating() {
    	return this.imdbRating;
    }
    
    public void setReleaseDate(String releaseDate) {
    	this.releaseDate = releaseDate;
    }
    
    public String getReleaseDate() {
    	return this.releaseDate;
    }
    
    
}
