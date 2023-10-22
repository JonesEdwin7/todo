package com.Jones.todoapp.repository;

import com.Jones.todoapp.model.Todo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class BeanManager {

    @Bean
    public ArrayList<Todo> getArrayList(){
        return new ArrayList<>();
    }

}
