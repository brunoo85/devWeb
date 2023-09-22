package com.example.demo2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo2.entities.Requisicao;

public interface RequisicaoRepository extends JpaRepository<Requisicao, Integer>{
    
}