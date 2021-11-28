package com.example.movieinfo.service.impl;

import com.example.movieinfo.domain.entity.Movie;
import com.example.movieinfo.domain.repository.MovieRepository;
import com.example.movieinfo.service.interfaces.MovieService;
import com.example.movieinfo.web.model.MovieDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 28, November 2021
 * Time: 6:16 AM
 * Project: movie-service
 * Package Name: com.example.movieinfo.service.impl
 * To change this template use File | Settings | File and Code Template
 */
@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    @Override
    public Set<MovieDto> getAllMovies() {
        List<Movie> movies = movieRepository.findAll();
        return movies.stream().map(MovieServiceImpl::movieToMovieDto).collect(Collectors.toSet());
    }

    @Override
    public MovieDto getMovieById(Long movieId) {
        Movie movie = movieRepository.getById(movieId);
        return movieToMovieDto(movie);
    }

    private static MovieDto movieToMovieDto(Movie movie){
        return MovieDto.builder()
                .movieId(movie.getMovieId())
                .description(movie.getDescription())
                .director(movie.getDirector())
                .movieName(movie.getMovieName())
                .genre(movie.getGenre())
                .build();
    }
}
