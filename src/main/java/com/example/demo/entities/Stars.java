package com.example.demo.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity (name = "stars")// This tells Hibernate to make a table out of this class
public class Stars {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private String a_id;

	@Column(name = "name")
	private String b_name;
	
	@Column(name = "birthYear")
	private Integer c_birthYear;

    @ManyToMany(mappedBy = "stars")
    Set<Movies> movies;

	public String getA_id() {
		return a_id;
	}

	public void setA_id(String a_id) {
		this.a_id = a_id;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public Integer getC_birthYear() {
		return c_birthYear;
	}

	public void setC_birthYear(Integer c_birthYear) {
		this.c_birthYear = c_birthYear;
	}
	
}
