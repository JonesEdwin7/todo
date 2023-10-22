package com.Jones.todoapp.repository;

import com.Jones.todoapp.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoRepository {

    @Autowired
    public List<Todo> todoList;

}
