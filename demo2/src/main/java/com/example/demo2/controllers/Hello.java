package com.example.demo2.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/")
    public String helloWorldGet(){
        return "Hello, world! This is a message";
    }

    @PostMapping String teste(){
        return "o post deu certo";
    }

    @DeleteMapping String teste2(){
        return "o delete deu certo";
    }

    @PutMapping String teste3(){
        return "IRAAAAA";
    }

}
