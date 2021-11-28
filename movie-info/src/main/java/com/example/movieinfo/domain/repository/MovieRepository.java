package com.example.movieinfo.domain.repository;

import com.example.movieinfo.domain.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 28, November 2021
 * Time: 6:13 AM
 * Project: movie-service
 * Package Name: com.example.movieinfo.domain.repository
 * To change this template use File | Settings | File and Code Template
 */
@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
