package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Event {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    private Gym gym;

    private String eventDateTime;
    private String eventName;
    private String eventCondition; //참여 조건
    private String eventDescription;
}
