package com.jspiders.DAO;

import com.jspiders.Config.DBConfig;
import com.jspiders.entity.MovieEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class MovieDaoImpl implements MovieDao {

    @Override
    public void addMovie(MovieEntity movieEntity)//create
    {
        System.out.println("Adding Movie");

        Session session = DBConfig.getSession();

        Transaction transaction = session.beginTransaction();

        session.persist(movieEntity);

        transaction.commit();

        session.close();
    }

    public MovieEntity getMovie(Long movieId)//read
    {
        System.out.println("Finding Movie by id : "+movieId);

        Session session = DBConfig.getSession();

        Transaction transaction = session.beginTransaction();

        MovieEntity movieEntity = session.find(MovieEntity.class,movieId);

        transaction.commit();

        session.close();

        return movieEntity;
    }

    public void updateMovie(Long movieId)//update
    {
        System.out.println("Updating Movie by id : "+movieId);
        Session session = DBConfig.getSession();
        //logics
        session.close();
    }

    public void deleteMovie(Long movieId)//delete
    {
        System.out.println("Deleting Movie by id : "+movieId);
        Session session = DBConfig.getSession();
        //logics
        session.close();
    }

}
