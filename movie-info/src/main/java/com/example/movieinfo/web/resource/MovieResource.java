package com.example.movieinfo.web.resource;

import com.example.movieinfo.service.interfaces.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 28, November 2021
 * Time: 6:18 AM
 * Project: movie-service
 * Package Name: com.example.movieinfo.web.resource
 * To change this template use File | Settings | File and Code Template
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/movie-info")
public class MovieResource {

    private final MovieService movieService;

    @GetMapping
    public ResponseEntity getAllMovies(){
        return new ResponseEntity(
                movieService.getAllMovies(),
                HttpStatus.OK
        );
    }

    @GetMapping("/{movieId}")
    public ResponseEntity getMovieById(@PathVariable Long movieId){
        return new ResponseEntity(
                movieService.getMovieById(movieId),
                HttpStatus.OK
        );
    }
}
