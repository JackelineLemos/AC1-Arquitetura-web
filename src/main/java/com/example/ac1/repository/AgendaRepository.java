package com.example.ac1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ac1.model.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long>{
    
}
