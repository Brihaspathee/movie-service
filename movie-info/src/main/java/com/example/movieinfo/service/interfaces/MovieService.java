package com.example.movieinfo.service.interfaces;

import com.example.movieinfo.web.model.MovieDto;

import java.util.Set;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 28, November 2021
 * Time: 6:15 AM
 * Project: movie-service
 * Package Name: com.example.movieinfo.service.interfaces
 * To change this template use File | Settings | File and Code Template
 */
public interface MovieService {

    Set<MovieDto> getAllMovies();

    MovieDto getMovieById(Long movieId);
}
