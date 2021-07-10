package com.example.demo.service;

import com.example.demo.entity.CarEntity;
import com.example.demo.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    @Autowired
    private CarRepository carRepository;

    @Override
    public CarEntity save(CarEntity car) {
        return carRepository.save(car);
    }

    @Override
    public CarEntity update(CarEntity car) {
        CarEntity savedCar = carRepository.getById(car.getId());
        savedCar.setModel(car.getModel());
        savedCar.setEngine(car.getEngine());
        savedCar.setInfotaSystem(car.getInfotaSystem());
        savedCar.setInteriorDesign(car.getInteriorDesign());
        savedCar.setCurrentLocation(car.getCurrentLocation());
        return carRepository.save(savedCar);
    }

    @Override
    public CarEntity findById(int id) {
        return carRepository.getById(id);
    }

    @Override
    public List<CarEntity> findAll() {
        return carRepository.findAll();
    }

    @Override
    public void delete(CarEntity Car) {
        carRepository.delete(Car);
    }

    @Override
    public CarEntity updateCarLocation(int idCar, String location) {
        CarEntity savedCar = carRepository.getById(idCar);
        savedCar.setCurrentLocation(location);
        return carRepository.save(savedCar);
    }
}