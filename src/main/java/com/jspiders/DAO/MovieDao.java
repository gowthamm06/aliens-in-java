package com.jspiders.DAO;

import com.jspiders.Enum.MovieStatus;
import com.jspiders.entity.MovieEntity;

import java.util.List;


public interface MovieDao {
    void addMovie(MovieEntity movieEntity);
    List<MovieEntity> getMovieByStatus(MovieStatus status);
    MovieEntity getMovieByTitle(String title);
}
