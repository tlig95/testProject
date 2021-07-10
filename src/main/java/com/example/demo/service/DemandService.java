package com.example.demo.service;

import com.example.demo.entity.DemandEntity;

import java.util.List;

public interface DemandService {
    public DemandEntity save(DemandEntity demand);
    public DemandEntity update(DemandEntity demand);
    public DemandEntity findById(int id);
    public List<DemandEntity> findAll();
    public void delete(DemandEntity demand);
    public List<Integer> findByUserID(int id);
}
