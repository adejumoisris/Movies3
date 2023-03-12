package com.idris.Movies3.repository;

import com.idris.Movies3.entity.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

   Optional<Movie> findByImbId(String imdbId);

}
