package com.example.movieratings.domain.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 27, November 2021
 * Time: 4:02 PM
 * Project: movie-service
 * Package Name: com.example.movieratings.domain.entity
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue
    private Long customerId;

    private String firstName;

    private String lastName;

    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    private Set<MovieRating> ratings;
}
