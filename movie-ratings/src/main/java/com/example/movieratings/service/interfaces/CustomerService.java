package com.example.movieratings.service.interfaces;

import com.example.movieratings.web.model.CustomerDto;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 27, November 2021
 * Time: 4:08 PM
 * Project: movie-service
 * Package Name: com.example.movieratings.service.interfaces
 * To change this template use File | Settings | File and Code Template
 */
public interface CustomerService {

    CustomerDto getCustomerById(Long customerId);
}
