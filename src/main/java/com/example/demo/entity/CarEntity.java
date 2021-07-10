package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String model;
    String engine;
    String infotaSystem;
    String interiorDesign;
    String currentLocation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getInfotaSystem() {
        return infotaSystem;
    }

    public void setInfotaSystem(String infotaSystem) {
        this.infotaSystem = infotaSystem;
    }

    public String getInteriorDesign() {
        return interiorDesign;
    }

    public void setInteriorDesign(String interiorDesign) {
        this.interiorDesign = interiorDesign;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }
}
