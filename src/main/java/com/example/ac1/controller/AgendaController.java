package com.example.ac1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ac1.model.Agenda;
import com.example.ac1.repository.AgendaRepository;

@RestController
public class AgendaController {

    @Autowired
    AgendaRepository agendaRepository;
   
        
    @GetMapping("/agendas")
    public List<Agenda> getAgendas(){
        return agendaRepository.findAll();
    }

    
}
