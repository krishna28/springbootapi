package com.demo.ea.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ea.model.Todo;
import com.demo.ea.repository.TodoDao;
import com.demo.ea.service.TodoService;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	TodoDao todoDao;
	
	@Override
	public void create(Todo todo) {
		todo.setDateCreated(new Date());
		todo.setDateUpdated(new Date());
		todoDao.save(todo);
	}
	@Override
	public Todo getTodo(String id) {
	    Optional<Todo> todo = todoDao.findById(id);
	    if(todo.isPresent()){
	    	return todo.get();
	    }
		return null;
	}
	@Override
	public void updateTodo(String id,Todo todo) {
		Todo todoInstance  = getTodo(id);
		todoInstance.setStatus(todo.getStatus());
		todoInstance.setDateUpdated(new Date());
		todoDao.save(todoInstance);
	}
	@Override
	public void deleteTodo(String id) {
		Todo todoInstance  = getTodo(id);
		todoDao.delete(todoInstance);
	}
	@Override
	public List<Todo> getAllTodo() {
		
		 return todoDao.findAll();
	}

}
