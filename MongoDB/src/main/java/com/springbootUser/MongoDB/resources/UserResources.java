package com.springbootUser.MongoDB.resources;


import com.springbootUser.MongoDB.domain.User;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        User everson = new User("1","Everson Mariano", "eversonmariano@gmail.com");
        User alex = new User("1","Alex Silva", "alexsilva@gmail.com");
        User beta = new User("1","Beta Mariano", "betamaria@hotmail.com");

        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(everson, alex, beta));
        return ResponseEntity.ok().body(list);
    }

}
