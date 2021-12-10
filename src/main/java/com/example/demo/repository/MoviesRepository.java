package com.example.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.Projections.MoviesSpecific;
import com.example.demo.entities.*;




public interface MoviesRepository extends PagingAndSortingRepository<Movies, String>{
    @Query("SELECT m FROM movies m")
    public Page<MoviesSpecific> findAllMoviesOnly(Pageable  p);
//	@Query("SELECT * FROM Movies")
//  public Page<Movies> findByPage(Pageable  p);
}