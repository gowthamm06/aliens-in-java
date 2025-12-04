package com.jspiders.DAO;

import com.jspiders.Config.DBConfig;
import com.jspiders.Enum.MovieStatus;
import com.jspiders.entity.MovieEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

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

    @Override
    public List<MovieEntity> getMovieByStatus(MovieStatus status) {

        Session session = DBConfig.getSession();

        String selectMovieByStatusHql = "FROM MovieEntity mov WHERE mov.status = :status";

        Query<MovieEntity> query = session.createQuery(selectMovieByStatusHql, MovieEntity.class);

        query.setParameter("status",status);

        Transaction transaction = session.beginTransaction();

        List<MovieEntity> resultList = query.getResultList();

        transaction.commit();

        session.close();

        return resultList;
    }

    @Override
    public MovieEntity getMovieByTitle(String title) {
        Session session = DBConfig.getSession();

        String selectMovieByTitleHql = "FROM MovieEntity mov WHERE mov.title = :title";

        Query<MovieEntity> query = session.createQuery(selectMovieByTitleHql, MovieEntity.class);

        query.setParameter("title",title);

        Transaction transaction = session.beginTransaction();

        MovieEntity movieEntity = query.uniqueResult();

        transaction.commit();

        session.close();

        return movieEntity;
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