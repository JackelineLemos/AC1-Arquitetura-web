package com.example.ac1.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ac1.model.Cursos;
import com.example.ac1.model.Professores;
import com.example.ac1.repository.CursoRepository;

@RestController
public class CursoController {
   


    @Autowired
    CursoRepository cursoRepository;
   
        
    @GetMapping("/cursos")
    public List<Cursos> getCursos(){
        return cursoRepository.findAll();
    }

    @GetMapping("/professores")
    public List<Professores> getUsuarios(Long id){
        return cursoRepository.findProfesorFetchCursos(id);
    }

    @PostMapping("/cadastrar")
    public Cursos postUsuario(@RequestBody Cursos cur){
        return cursoRepository.save(cur);
    }

    @PutMapping("/editar")
    public Cursos putUsuario(@RequestBody Cursos cur){
        return cursoRepository.save(cur);
    }

    @DeleteMapping("/deletar")
    public void deleteUsuario(@RequestBody Cursos cur){
        cursoRepository.delete(cur);
    }

    
}
