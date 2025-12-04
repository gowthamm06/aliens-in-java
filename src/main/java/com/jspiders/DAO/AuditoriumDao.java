package com.jspiders.DAO;

import com.jspiders.entity.AuditoriumEntity;
public interface AuditoriumDao {
    void addAuditorium(AuditoriumEntity auditoriumEntity);
    AuditoriumEntity getAuditorium(Long audiId);
    void updateAuditorium(Long audiId);
    void deleteAuditorium(Long audiId);
}
