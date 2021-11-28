package com.example.movieratings.domain.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 27, November 2021
 * Time: 4:02 PM
 * Project: movie-service
 * Package Name: com.example.movieratings.domain.entity
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MovieRating {

    @Id
    @GeneratedValue
    private Long movieRatingId;

    private Long movieId;

    private int ratingScore;

    @ManyToOne
    private Customer customer;
}
