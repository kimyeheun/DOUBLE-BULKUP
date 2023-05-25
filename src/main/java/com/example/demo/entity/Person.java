package com.example.demo.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Person {
    @Id
    private String personId;

    private String userPassword;
    private String userName;
    private LocalDate userBirth;
    private LocalDateTime userSignUpTime;
    private String userEmail;
    private String userPhone;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Enumerated(EnumType.STRING)
    private UserType userType;


}
