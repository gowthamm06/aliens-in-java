package com.jspiders.DAO;

import com.jspiders.Config.DBConfig;
import com.jspiders.entity.ShowEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ShowDaoImpl implements ShowDao{
    @Override
    public void addShow(ShowEntity showEntity) {
        System.out.println("Adding Show");

        Session session = DBConfig.getSession();

        Transaction transaction = session.beginTransaction();

        session.persist(showEntity);

        transaction.commit();

        session.close();

    }

    @Override
    public ShowEntity getShow(Long showId) {
        System.out.println("Finding Show");

        Session session = DBConfig.getSession();

        Transaction transaction = session.beginTransaction();

        ShowEntity showEntity = session.find(ShowEntity.class,showId);

        transaction.commit();

        session.close();

        return showEntity;
    }

    @Override
    public void updateShow(Long audiId) {

    }

    @Override
    public void deleteShow(Long audiId) {

    }
}