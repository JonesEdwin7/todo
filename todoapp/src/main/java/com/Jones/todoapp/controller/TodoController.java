package com.Jones.todoapp.controller;


import com.Jones.todoapp.model.Todo;
import com.Jones.todoapp.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TodoController {

    @Autowired
    Service service;

    @PostMapping("todo")
    public String addTodo(@RequestBody Todo todo){
        return service.addTodo(todo);
    }

    @GetMapping("todos")
    public ArrayList<Todo> getAllTodos(){
        return service.getAllTodos();
    }

    @GetMapping("allDoneTodos")
    public ArrayList<Todo> getAllDoneTodos(){
        return service.getAllDoneTodos();
    }

    @GetMapping("allUndoneTodos")
    public ArrayList<Todo> getAllUndoneTodos(){
        return service.getAllUndoneTodos();
    }

    @PutMapping("todo/todoId/{todoId}/todoStatus/{status}")
    public String updateTodoStatus(@PathVariable Integer todoId,@PathVariable boolean status){
        return service.updateTodoStatus(todoId,status);
    }

    @DeleteMapping("todo/todoId/{todoId}")
    public String deleteTodo(@PathVariable Integer todoId) {
        return service.deleteTodoById(todoId);
    }
}
