package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExerciseSupplement {
    @Id
    private String supplementName;

    private String usePurpose;
}
