package com.jspiders.DAO;

import com.jspiders.entity.ShowEntity;
public interface ShowDao {
    void addShow(ShowEntity showEntity);
    ShowEntity getShow(Long audiId);
    void updateShow(Long audiId);
    void deleteShow(Long audiId);
}
