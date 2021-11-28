package com.example.movieinfo.web.model;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 28, November 2021
 * Time: 6:13 AM
 * Project: movie-service
 * Package Name: com.example.movieinfo.web.model
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {

    private Long movieId;

    private String movieName;

    private String genre;

    private String description;

    private String director;
}
