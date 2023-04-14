package com.example.ac1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Habilitado {

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professores professor;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Cursos curso;
    
}
