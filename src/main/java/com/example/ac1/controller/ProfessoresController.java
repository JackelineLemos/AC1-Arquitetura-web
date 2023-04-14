package com.example.ac1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ac1.model.Professores;
import com.example.ac1.repository.ProfessoresRepository;

@RestController
public class ProfessoresController {

    @Autowired
    ProfessoresRepository professoresRepository;

    @GetMapping("/professores")
    public List<Professores> getProfessores(){
        return professoresRepository.findAll();
    }
    
}
