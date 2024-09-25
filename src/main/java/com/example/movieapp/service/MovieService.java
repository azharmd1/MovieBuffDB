package com.example.movieapp.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieService {
    @Value("${omdb.api.key}")
    private String apiKey;

    private final String BASE_URL = "http://www.omdbapi.com/";

    public String searchMovies(String title) {
        RestTemplate restTemplate = new RestTemplate();
        String url = String.format("http://www.omdbapi.com/?t=%s&apikey=%s", title, apiKey);

        try {
            String response = restTemplate.getForObject(url, String.class);

            if (response != null && response.contains("\"Response\":\"False\"")) {
                return "{\"Response\":\"False\",\"Error\":\"Movie not found. Please check the title and try again.\"}";
            }
            return response;
        } catch (HttpClientErrorException e) {
            return "{\"Response\":\"False\",\"Error\":\"An error occurred while fetching the movie data. Please try again later.\"}";
        } catch (Exception e) {
            return "{\"Response\":\"False\",\"Error\":\"An unexpected error occurred. Please try again later.\"}";
        }
    }

    public String getMovieDetails(String id) {
        RestTemplate restTemplate = new RestTemplate();
        String url = BASE_URL + "?i=" + id + "&apikey=" + apiKey;

        try {
            String response = restTemplate.getForObject(url, String.class);

            // Check if the response indicates an error
            if (response != null && response.contains("\"Response\":\"False\"")) {
                return "{\"Response\":\"False\",\"Error\":\"Movie not found. Please check the ID and try again.\"}";
            }
            return response;
        } catch (HttpClientErrorException e) {
            return "{\"Response\":\"False\",\"Error\":\"An error occurred while fetching the movie details. Please try again later.\"}";
        } catch (Exception e) {
            return "{\"Response\":\"False\",\"Error\":\"An unexpected error occurred. Please try again later.\"}";
        }
    }
}

