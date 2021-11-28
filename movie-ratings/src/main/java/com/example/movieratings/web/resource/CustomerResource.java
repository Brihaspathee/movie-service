package com.example.movieratings.web.resource;

import com.example.movieratings.service.interfaces.CustomerService;
import com.example.movieratings.web.model.CustomerDto;
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
 * Date: 27, November 2021
 * Time: 3:59 PM
 * Project: movie-service
 * Package Name: com.example.movieratings.web.resource
 * To change this template use File | Settings | File and Code Template
 */
@RestController
@RequestMapping("/api/v1/movie-rating")
@RequiredArgsConstructor
public class CustomerResource {

    private final CustomerService customerService;

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getMovieRatingForCustomer(@PathVariable Long customerId){
        CustomerDto customerDto = customerService.getCustomerById(customerId);
        return new ResponseEntity(customerDto, HttpStatus.OK);
    }
}
