package com.sparta.todoapp.service;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CommonResponse<T> {
    private Integer statuscode;
    private String msg;
    private T data;
}
