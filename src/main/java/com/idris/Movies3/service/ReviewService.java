package com.idris.Movies3.service;

import com.idris.Movies3.entity.Movie;
import com.idris.Movies3.entity.Review;
import com.idris.Movies3.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;
    @Autowired
    private MongoTemplate mongoTemplate;

    public Review createReview(String reviewBody, String imdb){
        Review review = new Review(reviewBody );
        return reviewRepository.insert(review);
        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdb ))
                .apply(new Update().push("reviewIds").value(review))
                .first();
        return review


    }
}
