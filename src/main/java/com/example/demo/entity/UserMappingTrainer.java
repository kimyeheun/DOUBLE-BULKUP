package com.example.demo.entity;

import javax.persistence.*;

public class UserMappingTrainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_trainer_id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Trainer trainer;
}
