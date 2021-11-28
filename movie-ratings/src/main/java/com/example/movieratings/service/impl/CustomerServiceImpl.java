package com.example.movieratings.service.impl;

import com.example.movieratings.domain.entity.Customer;
import com.example.movieratings.domain.repository.CustomerRepository;
import com.example.movieratings.service.interfaces.CustomerService;
import com.example.movieratings.web.model.CustomerDto;
import com.example.movieratings.web.model.MovieRatingDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 27, November 2021
 * Time: 4:09 PM
 * Project: movie-service
 * Package Name: com.example.movieratings.service.impl
 * To change this template use File | Settings | File and Code Template
 */
@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public CustomerDto getCustomerById(Long customerId) {
        Customer customer = customerRepository.getById(customerId);
        return customerToCustomerDto(customer);
    }

    private CustomerDto customerToCustomerDto(Customer customer){
        if(customer == null){
            return null;
        }
        CustomerDto customerDto = CustomerDto.builder()
                .customerId(customer.getCustomerId())
                .firstName(customer.getFirstName())
                .lastName(customer.getLastName())
                .ratings(customer.getRatings().stream().map(movieRating -> {
                    return MovieRatingDto.builder()
                            .movieId(movieRating.getMovieId())
                            .ratingScore(movieRating.getRatingScore())
                            .movieRatingId(movieRating.getMovieRatingId())
                            .build();
                }).collect(Collectors.toSet()))
                .build();
        return customerDto;
    }
}
