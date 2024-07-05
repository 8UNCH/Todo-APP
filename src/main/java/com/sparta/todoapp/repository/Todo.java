package com.sparta.todoapp.repository;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.ErrorResponse;

import java.time.LocalDateTime;

@Getter
@Entity
@NoArgsConstructor

public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "todo_id", nullable = false)
    private Long todoId;
    private String content;

    private String userName;

    private String password;

    private LocalDateTime createdAt;

    @Builder
    public Todo(string)

}
