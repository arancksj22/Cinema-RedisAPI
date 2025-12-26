package com.example.CinemaRedisAPI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    private Service service;

    Controller(Service service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<MovieModel>> getAllMovies(){
        List<MovieModel> movies = service.getAll();
        return ResponseEntity.ok(movies);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieModel> getMovie(@PathVariable Long id){
        return ResponseEntity.ok(service.getById(id));
    }

    @PostMapping({"/create","/save"})
    public ResponseEntity<MovieModel> postMovie(@RequestBody MovieModel movie){
        return ResponseEntity.ok(service.create(movie));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteMovie(@PathVariable Long id){
        service.deleteById(id);
        return ResponseEntity.ok("Deleted movie with id" + id);
    }
}
