package com.example.demo.entity;

import lombok.Getter;

@Getter
public enum Gender {
    MALE("MALE"),
    FEMALE("FEMALE");

    private final String value;

    Gender(String value){
        this.value = value;
    }

    public static Gender of(String name){
        for (Gender gender : Gender.values()) {
            if(gender.name().equalsIgnoreCase(name)){
                return gender;
            }
        }
        return null;
    }
}
