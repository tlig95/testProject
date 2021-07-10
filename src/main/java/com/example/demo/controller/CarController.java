package com.example.demo.controller;

import com.example.demo.entity.CarEntity;
import com.example.demo.entity.DemandEntity;
import com.example.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class CarController {
    @Autowired
    CarService service ;
    @GetMapping("/car/get")
    public List<CarEntity> getAll() {
        return service.findAll();
    }
    @GetMapping("/car/get/{id}")
    public CarEntity getById(@PathVariable(name = "id") int idCar) {
        return service.findById(idCar);
    }
    @PostMapping("/car/save")
    public void save(@RequestBody CarEntity car) {
        service.save(car);
    }
    @PostMapping("/car/update")
    public void updateCar(@RequestBody CarEntity car) {
        service.update(car);
    }
    @PostMapping("/car/updatelocation/{id}")
    public void updateCarLocation(@PathVariable int idcar,String location) {
        service.updateCarLocation(idcar,location);
    }
    @PostMapping("/car/remove")
    public void removeDemand(@RequestBody CarEntity car) {
        service.delete(car);
    }

}