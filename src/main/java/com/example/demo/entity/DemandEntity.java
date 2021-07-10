package com.example.demo.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class DemandEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @ManyToOne
    UserEntity user;
    @OneToOne
    CarEntity car;
    String pickUpLocation;
    String dropOffLocation;
    Timestamp earlistPickUp;
    Timestamp latestPickUp;
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

    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(String pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public String getDropOffLocation() {
        return dropOffLocation;
    }

    public void setDropOffLocation(String dropOffLocation) {
        this.dropOffLocation = dropOffLocation;
    }

    public Timestamp getEarlistPickUp() {
        return earlistPickUp;
    }

    public void setEarlistPickUp(Timestamp earlistPickUp) {
        this.earlistPickUp = earlistPickUp;
    }

    public Timestamp getLatestPickUp() {
        return latestPickUp;
    }

    public void setLatestPickUp(Timestamp latestPickUp) {
        this.latestPickUp = latestPickUp;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public CarEntity getCar() {
        return car;
    }

    public void setCar(CarEntity car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "DemandEntity{" +
                "id=" + id +
                ", user=" + user +
                ", car=" + car +
                ", pickUpLocation='" + pickUpLocation + '\'' +
                ", dropOffLocation='" + dropOffLocation + '\'' +
                ", earlistPickUp=" + earlistPickUp +
                ", latestPickUp=" + latestPickUp +
                ", engine='" + engine + '\'' +
                ", infotaSystem='" + infotaSystem + '\'' +
                ", interiorDesign='" + interiorDesign + '\'' +
                ", currentLocation='" + currentLocation + '\'' +
                '}';
    }
}
