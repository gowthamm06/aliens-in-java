package com.jspiders.DAO;

import com.jspiders.Config.DBConfig;
import com.jspiders.entity.AuditoriumEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class AuditoriumdaoImpl implements AuditoriumDao{
    @Override
    public void addAuditorium(AuditoriumEntity auditoriumEntity) {

        System.out.println("Adding Auditorium");

        Session session = DBConfig.getSession();

        Transaction transaction = session.beginTransaction();

        session.persist(auditoriumEntity);

        transaction.commit();

        session.close();

    }

    @Override
    public AuditoriumEntity getAuditorium(Long audiId) {
        Session session = DBConfig.getSession();

        Transaction transaction = session.beginTransaction();

        AuditoriumEntity auditoriumEntity = session.find(AuditoriumEntity.class,audiId);

        transaction.commit();

        session.close();

        return auditoriumEntity;
    }

    @Override
    public void updateAuditorium(Long audiId) {

    }

    @Override
    public void deleteAuditorium(Long audiId) {

    }
}
