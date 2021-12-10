package com.example.demo.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.Projections.MoviesSpecific;
import com.example.demo.entities.Movies;
import com.example.demo.repository.MoviesRepository;
import com.example.demo.utils.OffsetBasedPageRequest;

@Service
@Transactional
public class MoviesService {
    @Autowired
    private MoviesRepository mRepo;
    
    public List<MoviesSpecific> listAll(int pageNo, int pageSize) {
        Pageable paging = PageRequest.of(pageNo, pageSize);
        Page<MoviesSpecific> pagedResult = mRepo.findAllMoviesOnly(paging);
        return pagedResult.toList();
    }
}
