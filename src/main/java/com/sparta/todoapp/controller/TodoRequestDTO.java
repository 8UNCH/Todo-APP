package com.sparta.todoapp.controller;

import com.sparta.todoapp.repository.Todo;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
 public class TodoRequestDTO {
    private String title;

    private String content;

    private String userName;

    private String password;

    public Todo toEntity() {
        return Todo.builder()
                .title(title)
                .content(content)
                .userName(userName)
                .password(password)
                .build();
    }
}