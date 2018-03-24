package com.demo.ea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ea.model.Todo;
import com.demo.ea.service.TodoService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@CrossOrigin
@RestController
@RequestMapping("/todo")
public class TodoController {
	
	@Autowired
	TodoService todoService;
	
	@GetMapping
	public ResponseEntity<List<Todo>>  getAllTodo(){
		List<Todo> todos = todoService.getAllTodo();
		return new ResponseEntity<List<Todo>>(todos, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public Todo getTodo(@PathVariable String id){
		Todo todo = todoService.getTodo(id);
		return todo;
	}
	

	@PostMapping
	public void createTodo(@RequestBody Todo todo){
		System.out.println("the idea"+ todo);
		todoService.create(todo);
	}
	
	@PutMapping("/{id}")
	public void updateTodo(@PathVariable String id,@RequestBody Todo todo){
		todoService.updateTodo(id,todo);
	}
	@DeleteMapping("/{id}")
	public void deleteTodo(@PathVariable String id){
		todoService.deleteTodo(id);
	}
	
}
