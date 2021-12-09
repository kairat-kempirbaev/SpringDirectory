package com.example.demo.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity (name = "genres")
public class Genres {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;

	private String name;
	
    @ManyToMany(mappedBy = "genres")
    Set<Movies> movies;
    
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
