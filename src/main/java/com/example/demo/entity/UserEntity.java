package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    String gender;
    @JsonFormat(pattern="dd/MM/yyyy")
    Date birthdate;

    public UserEntity() {
    }

    public UserEntity(int id, String name, String gender, Date birthdate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthdate = birthdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }


}