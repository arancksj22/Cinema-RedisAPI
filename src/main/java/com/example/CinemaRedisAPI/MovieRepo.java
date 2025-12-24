package com.example.CinemaRedisAPI;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepo extends JpaRepository<MovieModel, Long> {
}
