package com.jspiders.dao;

import com.jspiders.DAO.MovieDaoImpl;
import com.jspiders.entity.MovieEntity;
import com.jspiders.Enum.CertificationType;
import com.jspiders.Enum.MovieStatus;

import java.util.List;

public class MovieDaoTests {

    public static void main(String[] args) {

        // testAddMovie();
        // testGetMovieByStatus();
        testGetMovieByTitle();
    }

    public static void testAddMovie()
    {
        System.out.println("Testing ADD Movie");
        try {

            MovieDaoImpl movieDao = new MovieDaoImpl();

            MovieEntity movieEntity = new MovieEntity();
            movieEntity.setTitle("Movie-1");
            movieEntity.setCertification(String.valueOf(CertificationType.U));
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

    public static void testGetMovieByStatus()
    {
        System.out.println("Testing Get Movie By Status");
        try {

            MovieDaoImpl movieDao = new MovieDaoImpl();
            List<MovieEntity> movieByStatusList = movieDao.getMovieByStatus(MovieStatus.AVAILABLE);

            for (MovieEntity mov: movieByStatusList)
            {
                System.out.println(mov);
            }
            System.out.println("✅Get Movie By Status Test PASSED");
        }
        catch (Exception ex) {
            System.err.println("❌Get Movie By Status Test FAILED");
            ex.printStackTrace();
        }
    }

    public static void testGetMovieByTitle()
    {
        System.out.println("Testing Get Movie By Title");
        try {

            MovieDaoImpl movieDao = new MovieDaoImpl();
            MovieEntity movieEntity = movieDao.getMovieByTitle("aaa");
            System.out.println(movieEntity);

            System.out.println("✅Get Get Movie By Title Test PASSED");
        }
        catch (Exception ex) {
            System.err.println("❌Get Get Movie By Title Test FAILED");
            ex.printStackTrace();
        }
    }


}