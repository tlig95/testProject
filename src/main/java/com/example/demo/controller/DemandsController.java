package com.example.demo.controller;

import com.example.demo.entity.DemandEntity;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.DemandService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class DemandsController {
    @Autowired
    DemandService service ;
    @Autowired
    UserService userService ;
    @GetMapping("/demands/get")
    public List<DemandEntity> getAll() {
        return service.findAll();
    }
    @GetMapping("/demands/get/{id}")
    public DemandEntity getById(@PathVariable(name = "id") int idDemand) {
        return service.findById(idDemand);
    }
    @PostMapping("/demands/save")
    public ResponseEntity save(@RequestBody DemandEntity demand) {
        UserEntity user = demand.getUser();
        if(user==null || user.getId()==0)
            return new ResponseEntity("user in not saved", HttpStatus.BAD_REQUEST);
        if(user.getId()!=0){
            UserEntity userdb = userService.findById(user.getId());
            if(userdb==null)
                return new ResponseEntity("user in not saved", HttpStatus.BAD_REQUEST);
        }
        DemandEntity save = service.save(demand);
        return new ResponseEntity(save,HttpStatus.ACCEPTED);
    }
    @PostMapping("/demands/update")
    public void updateDemand(@RequestBody DemandEntity demand) {
        service.update(demand);
    }
    @PostMapping("/demands/remove")
    public void removeDemand(@RequestBody DemandEntity demand) {
        service.delete(demand);
    }

}