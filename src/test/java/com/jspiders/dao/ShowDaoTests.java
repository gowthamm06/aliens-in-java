package com.jspiders.dao;

import com.jspiders.DAO.AuditoriumdaoImpl;
import com.jspiders.DAO.MovieDaoImpl;
import com.jspiders.DAO.ShowDaoImpl;
import com.jspiders.entity.AuditoriumEntity;
import com.jspiders.entity.MovieEntity;
import com.jspiders.entity.ShowEntity;
import com.jspiders.Enum.ShowStatus;

import java.time.LocalDate;

public class ShowDaoTests {

    public static void main(String[] args) {
        addShowTest();
    }

    public static void addShowTest()
    {
        System.out.println("Testing ADD Show");
        try {

            ShowDaoImpl showDaoImpl = new ShowDaoImpl();
            AuditoriumdaoImpl auditoriumDao = new AuditoriumdaoImpl();
            MovieDaoImpl movieDao = new MovieDaoImpl();

            ShowEntity showEntity = new ShowEntity();
            showEntity.setShowTime(LocalDate.now());
            showEntity.setEndTime(LocalDate.now());
            showEntity.setStatus(ShowStatus.OPEN);

            AuditoriumEntity auditoriumEntity = auditoriumDao.getAuditorium(1l);
            showEntity.setAuditorium(auditoriumEntity);//link audi to show

            MovieEntity movieEntity = movieDao.getMovie(1l);
            showEntity.setMovie(movieEntity);//link movie to show

            showDaoImpl.addShow(showEntity);//add show to table

            System.out.println("✅ADD Show Test PASSED");
        }
        catch (Exception ex) {
            System.err.println("❌ADD Show Test FAILED");
            ex.printStackTrace();
        }
    }
}