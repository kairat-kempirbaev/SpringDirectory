package com.example.demo.serializers;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
public class SalesKey implements Serializable {
    	private static final long serialVersionUID = 1L;

		@Column(name = "customerId")
	    private Integer customerId;

	    @Column(name = "movieId")
	    private String  movieId;

	    @Column(name = "id")
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;

		public Integer getCustomerId() {
			return customerId;
		}

		public void setCustomerId(Integer customerId) {
			this.customerId = customerId;
		}

		public String getMovieId() {
			return movieId;
		}

		public void setMovieId(String movieId) {
			this.movieId = movieId;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long salesId) {
			id = salesId;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		@Override
		public int hashCode() {
			return Objects.hash(this);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			SalesKey other = (SalesKey) obj;
			return Objects.equals(customerId, other.customerId) && Objects.equals(movieId, other.movieId) && Objects.equals(this.id, other.id);
		}
}
