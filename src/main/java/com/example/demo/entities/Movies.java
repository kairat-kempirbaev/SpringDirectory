package com.example.demo.entities;

import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.*;

@Entity (name = "movies")// This tells Hibernate to make a table out of this class
public class Movies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private String id; 
    private String title;
    private Integer year;
    private String director;
    
    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "genres_in_movies", 
    		  joinColumns = @JoinColumn(name = "movieId"), 
    		  inverseJoinColumns = @JoinColumn(name = "genreId"))
    private Set<Genres> genres;
    
    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "stars_in_movies", 
    		  joinColumns = @JoinColumn(name = "movieId"), 
    		  inverseJoinColumns = @JoinColumn(name = "starId"))
    private Set<Stars> stars;
    
    @JsonIgnore
    @OneToMany(mappedBy = "movieId")
    private Set<Sales> sales;
    
    @JsonIgnore
    @OneToOne(mappedBy = "movie", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Ratings rating;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Set<Genres> getGenres() {
		return genres;
	}

	public void setGenres(Set<Genres> genres) {
		this.genres = genres;
	}

	public Set<Stars> getStars() {
		return stars;
	}

	public void setStars(Set<Stars> stars) {
		this.stars = stars;
	}

	public Set<Sales> getSales() {
		return sales;
	}

	public Ratings getRating() {
		return rating;
	}

	public void setRating(Ratings rating) {
		this.rating = rating;
	}

	public void setSales(Set<Sales> sales) {
		this.sales = sales;
	}


}
