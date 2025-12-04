package com.jspiders.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "auditorium")
public class AuditoriumEntity extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "audi_name",nullable = false)
    private  String name;
    @Column(name = "seat_rows",nullable = false)
    private  Integer seatRows;
    @Column(name = "seat_columns",nullable = false)
    private  Integer seatColumns;

    @OneToMany(mappedBy = "auditorium",cascade = CascadeType.ALL)
    private List<ShowEntity> showList = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSeatRows() {
        return seatRows;
    }

    public void setSeatRows(Integer seatRows) {
        this.seatRows = seatRows;
    }

    public Integer getSeatColumns() {
        return seatColumns;
    }

    public void setSeatColumns(Integer seatColumns) {
        this.seatColumns = seatColumns;
    }

    public List<ShowEntity> getShowList() {
        return showList;
    }

    public void setShowList(List<ShowEntity> showList) {
        this.showList = showList;
    }

    @Override
    public String toString() {
        return "AuditoriumEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", seatRows=" + seatRows +
                ", seatColumns=" + seatColumns +
                '}';
    }
}