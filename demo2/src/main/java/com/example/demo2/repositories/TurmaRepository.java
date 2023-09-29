package com.example.demo2.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo2.entities.Turma;

public interface TurmaRepository extends JpaRepository <Turma, Integer>{
    
}