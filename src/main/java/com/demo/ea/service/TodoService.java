package com.demo.ea.service;

import java.util.List;

import com.demo.ea.model.Todo;

public interface TodoService {

	void create(Todo toto);
	Todo getTodo(String id);
	List<Todo> getAllTodo();
	void updateTodo(String id, Todo todo);
	void deleteTodo(String id);
}
