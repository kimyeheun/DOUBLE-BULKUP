package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class GymFacilities {
    @Id
    @OneToOne
    private Gym gym;

    private Integer showerBoothCnt;
    private Boolean fittingRoom;
    private Boolean clothes;
    private Integer lockerCnt;
    private String howToAttendance;
}

