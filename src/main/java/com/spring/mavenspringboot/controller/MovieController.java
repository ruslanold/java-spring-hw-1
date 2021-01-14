package com.spring.mavenspringboot.controller;

import com.spring.mavenspringboot.entyty.Movie;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    private List<Movie> movies = new ArrayList<>();

    {
        movies.add(new Movie(1,"Potter", "crime", 140));
        movies.add(new Movie(2,"Secret 5 sister", "drama", 110));
        movies.add(new Movie(3,"Vikings", "history", 310));


    }

    @GetMapping()
    public List<Movie> getMovies(){
        return this.movies;
    }

    @PostMapping()
    public Movie createMovie(@RequestBody  Movie movie){
        this.movies.add(movie);
        return movie;
    }

}
