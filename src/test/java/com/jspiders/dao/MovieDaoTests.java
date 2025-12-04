package com.jspiders.dao;

import com.jspiders.DAO.MovieDaoImpl;
import com.jspiders.entity.MovieEntity;
import com.jspiders.Enum.MovieStatus;

public class MovieDaoTests {

    public static void main(String[] args) {
        testAddMovie();
    }

    public static void testAddMovie()
    {
        System.out.println("Testing ADD Movie");
        try {

            MovieDaoImpl movieDao = new MovieDaoImpl();

            MovieEntity movieEntity = new MovieEntity();
            movieEntity.setTitle("Movie-1");
            movieEntity.setCertification("U");
            movieEntity.setLanguage("ENG");
            movieEntity.setDuration(120);
            movieEntity.setStatus(MovieStatus.AVAILABLE);

            movieDao.addMovie(movieEntity);

            System.out.println("✅ADD MOVIE Test PASSED");
        }
        catch (Exception ex) {
            System.err.println("❌ADD MOVIE Test FAILED");
            ex.printStackTrace();
        }
    }
}