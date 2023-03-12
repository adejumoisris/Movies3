package com.idris.Movies3.entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "movies")
public class Movie {
    @Id
    private ObjectId Id;
    private String imbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
     private String poster;

     private List<String> genres;

     private List<String> backdrops;
     @DocumentReference
     private List<Review> reviewIds;
}
