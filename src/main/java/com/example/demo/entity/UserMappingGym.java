package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class UserMappingGym {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_gym_id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
    @ManyToOne(fetch = FetchType.LAZY)
    private Gym gym;
}
