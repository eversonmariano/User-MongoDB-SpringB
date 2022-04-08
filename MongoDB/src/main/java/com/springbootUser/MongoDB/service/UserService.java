package com.springbootUser.MongoDB.service;

import com.springbootUser.MongoDB.domain.User;
import com.springbootUser.MongoDB.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;


    public List<User> findAll(){
        return repository.findAll();
    }



}
