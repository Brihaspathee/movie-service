package com.example.moviecatalog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 27, November 2021
 * Time: 3:48 PM
 * Project: movie-service
 * Package Name: com.example.moviecatalog.config
 * To change this template use File | Settings | File and Code Template
 */
@Component
public class BeanConfig {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public WebClient getWebClient(){
        return WebClient.builder().build();
    }
}
