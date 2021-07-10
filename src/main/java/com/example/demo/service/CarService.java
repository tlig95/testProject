package com.example.demo.service;

import com.example.demo.entity.CarEntity;

import java.util.List;

public interface CarService {
    public CarEntity save(CarEntity car);
    public CarEntity update(CarEntity car);
    public CarEntity findById(int id);
    public List<CarEntity> findAll();
    public void delete(CarEntity car);
    public CarEntity updateCarLocation(int idCar,String location);

}
