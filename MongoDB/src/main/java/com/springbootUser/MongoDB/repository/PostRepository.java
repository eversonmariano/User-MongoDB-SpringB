package com.springbootUser.MongoDB.repository;

import com.springbootUser.MongoDB.domain.Post;
import com.springbootUser.MongoDB.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {



}
