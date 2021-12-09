package com.example.demo.entities;
import com.example.demo.serializers.*;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity (name = "sales")
public class Sales {
    @EmbeddedId
    SalesKey id;
	
    @ManyToOne
    @MapsId("movieId")
    @JoinColumn(name = "movieId")
    Movies movieId;

    @ManyToOne
    @MapsId("customerId")
    @JoinColumn(name = "customerId")
    Customers customerId;
	
	private Date saleDate;
	
	public SalesKey getId() {
		return id;
	}
	
	public void setId(SalesKey id) {
		this.id = id;
	}
	
	public Customers getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(Customers customerId) {
		this.customerId = customerId;
	}
	
	public Movies getMovieId() {
		return movieId;
	}
	
	public void setMovieId(Movies movieId) {
		this.movieId = movieId;
	}
	
	public Date getSaleDate() {
		return saleDate;
	}
	
	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}
}
