package com.example.demo.service;

import com.example.demo.entity.DemandEntity;
import com.example.demo.repository.DemandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemandServiceImpl implements DemandService{
    @Autowired
    private DemandRepository demandRepository;

    @Override
    public DemandEntity save(DemandEntity demand) {
        return demandRepository.save(demand);
    }

    @Override
    public DemandEntity update(DemandEntity demand) {
        DemandEntity savedDemand = demandRepository.getById(demand.getId());
        savedDemand.setPickUpLocation(demand.getPickUpLocation());
        savedDemand.setDropOffLocation(demand.getDropOffLocation());
        savedDemand.setCurrentLocation(demand.getCurrentLocation());
        savedDemand.setEarlistPickUp(demand.getEarlistPickUp());
        savedDemand.setLatestPickUp(demand.getLatestPickUp());
        savedDemand.setEngine(demand.getEngine());
        savedDemand.setInfotaSystem(demand.getInfotaSystem());
        savedDemand.setInteriorDesign(demand.getInteriorDesign());
        return demandRepository.save(savedDemand);
    }

    @Override
    public DemandEntity findById(int id) {
        return demandRepository.getById(id);
    }

    @Override
    public List<DemandEntity> findAll() {
        return demandRepository.findAll();
    }

    @Override
    public void delete(DemandEntity demand) {
        demandRepository.delete(demand);
    }

    @Override
    public List<Integer> findByUserID(int id) {
        return demandRepository.findByIdUser(id);
    }
}