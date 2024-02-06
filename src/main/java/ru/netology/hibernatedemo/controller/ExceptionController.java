package ru.netology.hibernatedemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.netology.hibernatedemo.exception.NotFoundException;

@RestControllerAdvice
public class ExceptionController {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<String> handlerInvalidCredentials(NotFoundException e){
        return ResponseEntity.badRequest().body("Not Found Exception: " + e.getMessage());
    }

}
