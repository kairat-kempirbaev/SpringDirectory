package com.example.demo.Projections;

import java.util.Set;

import com.example.demo.entities.Genres;
import com.example.demo.entities.Ratings;
import com.example.demo.entities.Stars;

public interface MoviesSpecific {
	String getId();
    String getTitle();
    String getDirector();
    Integer getYear();
    Set<Genres> getGenres();
    Set<Stars> getStars();
    Ratings getRating();
}