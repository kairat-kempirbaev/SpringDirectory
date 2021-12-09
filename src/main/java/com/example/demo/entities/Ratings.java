package com.example.demo.entities;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity (name = "ratings")// This tells Hibernate to make a table out of this class
public class Ratings {
    @Id
    @Column(name = "movieId")
    private String movieId; 
    
    private Float rating;
    private Integer numVotes;
    
    @OneToOne
    @MapsId
    @JoinColumn(name = "movieId")
    private Movies movie;

	public Movies getMovie() {
		return movie;
	}

	public void setMovieId(Movies movieId) {
		this.movie = movieId;
	}

	public Float getRating() {
		return rating;
	}
	
	public void setRating(Float rating) {
		this.rating = rating;
	}
	
	public Integer getNumVotes() {
		return numVotes;
	}
	
	public void setNumVotes(Integer numVotes) {
		this.numVotes = numVotes;
	}
}