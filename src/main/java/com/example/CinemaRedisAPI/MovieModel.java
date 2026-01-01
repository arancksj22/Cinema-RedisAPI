package com.example.CinemaRedisAPI;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class MovieModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Long rating;
    private String review;

    public MovieModel(Long id, String name, Long rating, String review) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.review = review;
    }

    public MovieModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRating() {
        return rating;
    }

    public void setRating(Long rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "MovieModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                ", review='" + review + '\'' +
                '}';
    }
}
;