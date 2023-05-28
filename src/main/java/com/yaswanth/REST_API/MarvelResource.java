package com.yaswanth.REST_API;

import jakarta.websocket.server.PathParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.*;

@Path("movies")
public class MarvelResource {
	

    MarvelRepository obj = new MarvelRepository();
	
	@GET
	@Path("movie")
	@Produces(MediaType.APPLICATION_XML)
    public List<Marvel> getMarvelMovies() {
		return obj.getMovies();
    }
	
	@Path("movie/{name}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Marvel getMarvelMovie(@PathParam("name") String name) {	
		obj.getMovies();
		return obj.getMovie(name);
	}
	
	@POST
	@Path("add")
	public List<Marvel> addMovie(Marvel m1) {
		obj.addMarvel(m1.getName(),m1.getRating(),m1.getReleaseDate());
		
		return obj.getMovies();
	}
}
