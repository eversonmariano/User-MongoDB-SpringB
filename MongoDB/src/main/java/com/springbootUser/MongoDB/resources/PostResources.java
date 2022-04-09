package com.springbootUser.MongoDB.resources;


import com.springbootUser.MongoDB.domain.Post;

import com.springbootUser.MongoDB.service.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/posts")
public class PostResources {

    @Autowired
    private PostService service;



    @GetMapping("/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id){
        Post obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }



}
