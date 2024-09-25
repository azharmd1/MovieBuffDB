package com.example.movieapp.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieService {
    @Value("${omdb.api.key}")
    private String apiKey;

    private final String BASE_URL = "http://www.omdbapi.com/";

    public String searchMovies(String title) {
        RestTemplate restTemplate = new RestTemplate();
        String url = BASE_URL + "?s=" + title + "&apikey=" + apiKey;
        return restTemplate.getForObject(url, String.class);
    }

    public String getMovieDetails(String id) {
        RestTemplate restTemplate = new RestTemplate();
        String url = BASE_URL + "?i=" + id + "&apikey=" + apiKey;
        return restTemplate.getForObject(url, String.class);
    }
}