package com.example.CinemaRedisAPI;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {

    private final MovieRepo repo;

    Service(MovieRepo repo){
        this.repo = repo;
    }

    @Cacheable(value = "movie", key = "#id")
    public MovieModel getById(Long id){
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Movie not found"));
    }

    @Cacheable(value = "allMovies")
    public List<MovieModel> getAll(){
        return repo.findAll();
    }

    @CacheEvict(value = "allMovies", allEntries = true)
    public MovieModel create(MovieModel model){
        return repo.save(model);
    }

    @Caching(evict = {
            @CacheEvict(value = "movie", key = "#id"),      // Remove specific movie
            @CacheEvict(value = "allMovies", allEntries = true) // Remove list cache
    })
    public void deleteById(Long id){
        repo.deleteById(id);
    }
}
