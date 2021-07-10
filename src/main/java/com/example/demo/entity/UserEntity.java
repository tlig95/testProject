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
/*    @OneToMany
    List<DemandEntity> demandList;*/

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

/*    public List<DemandEntity> getDemandList() {
        return demandList;
    }

    public void setDemandList(List<DemandEntity> demandList) {
        this.demandList = demandList;
    }*/
}