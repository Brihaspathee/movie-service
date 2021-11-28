package com.example.moviecatalog.web.model;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 27, November 2021
 * Time: 3:52 PM
 * Project: movie-service
 * Package Name: com.example.moviecatalog.web.model
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {

    private Long movieId;

    private String genre;

    private String description;

    private String director;

    @Override
    public String toString() {
        return "MovieDto{" +
                "movieId=" + movieId +
                ", genre='" + genre + '\'' +
                ", description='" + description + '\'' +
                ", director='" + director + '\'' +
                '}';
    }
}
