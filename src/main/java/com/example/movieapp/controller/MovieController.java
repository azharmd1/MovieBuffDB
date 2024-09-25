package com.example.movieapp.controller;


import com.example.movieapp.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/search")
    public String searchMovies(@RequestParam String title) {
        return movieService.searchMovies(title);
    }

    @GetMapping("/details")
    public String getMovieDetails(@RequestParam String id) {
        return movieService.getMovieDetails(id);
    }
}
