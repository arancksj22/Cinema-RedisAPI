package com.example.CinemaRedisAPI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    private Service service;

    Controller(Service service){
        this.service = service;
    }

    @GetMapping
    public String HelloTester(){
        return "Hello, the backend is working";
    }

    @GetMapping
    public ResponseEntity<List<MovieModel>> getAllMovies(){

    }
}
