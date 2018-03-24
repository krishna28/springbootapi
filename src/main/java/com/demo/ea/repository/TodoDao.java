package com.demo.ea.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.ea.model.Todo;

public interface TodoDao extends MongoRepository<Todo, String> {

}
