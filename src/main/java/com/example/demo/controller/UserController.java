package com.example.demo.controller;

import com.example.demo.entity.CarEntity;
import com.example.demo.entity.DemandEntity;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.CarService;
import com.example.demo.service.DemandService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class UserController {
    @Autowired
    UserService service ;
    @Autowired
    DemandService demandService ;
    @GetMapping("/user/get")
    public List<UserEntity> getAll() {
        return service.findAll();
    }
    @GetMapping("/user/get/{id}")
    public UserEntity getById(@PathVariable(name = "id") int idUser) {
        return service.findById(idUser);
    }
    @PostMapping("/user/save")
    public void save(@RequestBody UserEntity user) {
        service.save(user);
    }
    @PostMapping("/user/remove")
    public ResponseEntity removeDemand(@RequestBody UserEntity user) {
        if(user==null || user.getId()==0)
            return new ResponseEntity("user in not saved", HttpStatus.BAD_REQUEST);
        if(user.getId()!=0){
            List<DemandEntity> byUserID = demandService.findByUserID(user.getId());
            if(byUserID!=null && byUserID.size()>0)
                return new ResponseEntity("user have demands", HttpStatus.BAD_REQUEST);
        }
        service.delete(user);
        return new ResponseEntity("user deleted",HttpStatus.ACCEPTED);
    }


}