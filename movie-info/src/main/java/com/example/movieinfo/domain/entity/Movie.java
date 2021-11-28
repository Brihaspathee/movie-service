package com.example.movieinfo.domain.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 28, November 2021
 * Time: 6:11 AM
 * Project: movie-service
 * Package Name: com.example.movieinfo.domain.entity
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Movie {

    @Id
    @GeneratedValue
    private Long movieId;

    private String movieName;

    private String genre;

    private String description;

    private String director;
}
