package com.idris.Movies3.service;

import com.idris.Movies3.entity.Movie;
import com.idris.Movies3.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();

    }

    public Optional<Movie> singleMovie(String imdbId){
        String ImdbId = null;
        return movieRepository.findByImbId(ImdbId );
    }
}
