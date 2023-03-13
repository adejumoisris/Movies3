package com.idris.Movies3.controller;

import com.idris.Movies3.entity.Review;
import com.idris.Movies3.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/movies")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;
    @PostMapping()
    public ResponseEntity<Review> creatReview(@PathVariable Map<String, String> payload){
        return new ResponseEntity<Review>(reviewService.createReview(payload.get("reviewBody"), payload.get(ImbId), HttpStatus.CREATED));
    }
}
