package com.example.moviecatalog.web.model;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 27, November 2021
 * Time: 3:51 PM
 * Project: movie-service
 * Package Name: com.example.moviecatalog.web.model
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MovieRatingDto {

    private Long movieRatingId;

    private Long movieId;

    private int ratingScore;

    private MovieDto movieDto;
}
