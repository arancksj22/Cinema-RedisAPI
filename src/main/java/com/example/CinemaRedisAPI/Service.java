package com.example.CinemaRedisAPI;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public class Service {

    private final MovieRepo repo;

    Service(MovieRepo repo){
        this.repo = repo;
    }

    public MovieModel getById(Long id){
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Movie not found"));
    }

    public List<MovieModel> getAll(){
        return repo.findAll();
    }

    public Optional<MovieModel> create(MovieModel model){
        return repo.save(model);
    }
}
