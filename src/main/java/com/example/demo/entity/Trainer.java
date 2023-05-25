package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Trainer extends Person{
    @ManyToOne(fetch = FetchType.LAZY)
    private Gym gymName;

    private LocalDateTime trainerWorkTime;
    private String trainerCertificate;
    private String trainerPrize;
}
