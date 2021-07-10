package com.example.demo.service;

import com.example.demo.entity.UserEntity;

import java.util.List;

public interface UserService {
    public UserEntity save(UserEntity user);
    public UserEntity update(UserEntity user);
    public UserEntity findById(int id);
    public List<UserEntity> findAll();
    public void delete(UserEntity user);
}
