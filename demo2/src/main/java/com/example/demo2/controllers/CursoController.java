package com.example.demo2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.entities.Curso;
import com.example.demo2.services.CursoService;

@RestController
@RequestMapping("/curso")
public class CursoController {
    
    @Autowired
    CursoService cursoService;

    @GetMapping("/{idCurso}")
    public ResponseEntity<?> getCurso(@PathVariable Integer idCurso){
        Curso curso = cursoService.getCurso(idCurso);
        return ResponseEntity.status(HttpStatus.OK).body(curso.toString());
    }
}
