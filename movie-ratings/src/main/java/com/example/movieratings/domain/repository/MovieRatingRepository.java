package com.example.movieratings.domain.repository;

import com.example.movieratings.domain.entity.MovieRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 27, November 2021
 * Time: 4:07 PM
 * Project: movie-service
 * Package Name: com.example.movieratings.domain.repository
 * To change this template use File | Settings | File and Code Template
 */
@Repository
public interface MovieRatingRepository extends JpaRepository<MovieRating, Long> {
}
