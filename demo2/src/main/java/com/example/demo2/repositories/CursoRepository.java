package com.example.demo2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo2.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer>{
    
}
