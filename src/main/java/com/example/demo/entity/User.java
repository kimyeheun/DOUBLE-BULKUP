package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class User extends Person{
    private String userAddress;
    private Long userHeight;
    private Long userWeight;

    @Enumerated(EnumType.STRING)
    private Purpose purpose;
}
