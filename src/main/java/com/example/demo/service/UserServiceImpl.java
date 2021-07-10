package com.example.demo.service;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity save(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public UserEntity update(UserEntity user) {
        UserEntity savedUser = userRepository.getById(user.getId());
        savedUser.setGender(user.getGender());
        savedUser.setBirthdate(user.getBirthdate());
        savedUser.setName(user.getName());
        return userRepository.save(savedUser);
    }

    @Override
    public UserEntity findById(int id) {
        return userRepository.getById(id);
    }

    @Override
    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void delete(UserEntity user) {
        userRepository.delete(user);
    }
}