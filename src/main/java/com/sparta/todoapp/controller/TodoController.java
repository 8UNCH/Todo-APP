package com.sparta.todoapp.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
    //post mapping이 value, method를 포함함.
    @PostMapping("/v1.0/todo")
    public ResponseEntity postTodo() {
        return ResponseEntity.ok(). build() ;
    }
}
