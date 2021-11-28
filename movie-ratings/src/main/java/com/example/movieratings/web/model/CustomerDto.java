package com.example.movieratings.web.model;

import lombok.*;

import java.util.Set;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 27, November 2021
 * Time: 3:57 PM
 * Project: movie-service
 * Package Name: com.example.movieratings.web.model
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {

    private Long customerId;

    private String firstName;

    private String lastName;

    private Set<MovieRatingDto> ratings;
}
