package com.example.demo2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo2.entities.Curso;
import com.example.demo2.repositories.CursoRepository;

@Service
public class CursoService {
    
    @Autowired
    private CursoRepository cursoRepository;

    public Curso getCurso(Integer idCurso){
        return cursoRepository.getReferenceById(idCurso);
    }

    public Curso salvar(Curso curso){
        return cursoRepository.save(curso);
    }

    public Curso atualizar(Curso curso){
        return cursoRepository.save(curso);
    }

    public void remover(Integer idCurso){
        cursoRepository.deleteById(idCurso);
    }
}
