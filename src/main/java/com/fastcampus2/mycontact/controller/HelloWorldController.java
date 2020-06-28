package com.fastcampus2.mycontact.controller;

import com.fastcampus2.mycontact.exception.dto.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloWorldController {
    @GetMapping(value = "/api/helloworld")
    public String helloWorld() {
        return "HelloWorld";
    }

    @GetMapping(value = "/api/helloException")
    public String helloException() {
        throw new RuntimeException("Hello RuntimeXception");
    }
}
