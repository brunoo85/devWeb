package com.example.demo2.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    Integer quantidadeGets = 0;
    Integer quantidadePuts = 0;
    Integer quantidadePosts = 0;
    Integer quantidadeDeletes = 0;

    public Integer quantidadeGets(){
        // integer  = inteiro
        return ++quantidadeGets;
    }

    public Integer quantidadePuts(){
        // integer  = inteiro
        return ++quantidadePuts;
    }

    
    public Integer quantidadePosts(){
        // integer  = inteiro
        return ++quantidadePosts;
    }

    public Integer quantidadeDeletes(){
        // integer  = inteiro
        return ++quantidadeDeletes;
    }

}
