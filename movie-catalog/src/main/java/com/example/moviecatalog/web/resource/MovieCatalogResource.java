package com.example.moviecatalog.web.resource;

import com.example.moviecatalog.web.model.CustomerDto;
import com.example.moviecatalog.web.model.MovieDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.stream.Collectors;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 28, November 2021
 * Time: 6:26 AM
 * Project: movie-service
 * Package Name: com.example.moviecatalog.web.resource
 * To change this template use File | Settings | File and Code Template
 */
@RestController
@RequestMapping(("/api/v1/movie-catalog"))
@RequiredArgsConstructor
@Slf4j
public class MovieCatalogResource {

    @Value("${url.movie.info}")
    private String movieInfoHost;

    @Value("${url.movie.ratings}")
    private String movieRatingsHost;

    private final WebClient webClient;

    @GetMapping("/{customerId}")
    public ResponseEntity getMovieCatalogForCustomer(@PathVariable Long customerId){
        //CustomerDto = restTemplate.getForObject("http://localhost:8082/api/v1/movie-rating/"+customerId,CustomerDto.class);
        log.info("movie info host:" + movieInfoHost);
        CustomerDto customerDto = webClient
                .get()
                .uri(movieRatingsHost+"/api/v1/movie-rating/"+customerId)
                .retrieve()
                .bodyToMono(CustomerDto.class)
                .block();


        //ResponseEntity<CustomerDto> responseEntity = movieRatingFeignClient.getRatings(customerId);
        //CustomerDto customerDto = responseEntity.getBody();
        customerDto.getRatings().stream().map(movieRatingDto -> {
            //MovieDto movieDto = restTemplate.getForObject("http://localhost:8081/api/v1/movie-info/"+movieRatingDto.getMovieId(), MovieDto.class);
            MovieDto movieDto = webClient
                    .get()
                    .uri(movieInfoHost+"/api/v1/movie-info/"+movieRatingDto.getMovieId())
                    .retrieve()
                    .bodyToMono(MovieDto.class)
                    .block();
            movieRatingDto.setMovieDto(movieDto);
            return movieRatingDto;
        }).collect(Collectors.toSet());

        return new ResponseEntity(customerDto, HttpStatus.OK);
    }
}
