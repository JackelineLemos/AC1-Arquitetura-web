package com.example.ac1.model;

import java.sql.Date;
import java.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Agenda {

    @DateTimeFormat(pattern = "dd/MM")
    private Date dataInicio;

    @DateTimeFormat(pattern = "dd/MM")
    private Date dataFim;

    private LocalDateTime horaInicio;

    private LocalDateTime horaFim;

    @Column (length = 200, nullable = false)
    private String cidade;

    @Column (length = 2, nullable = false)
    private String estado;

    @Column (length = 20, nullable = false)
    private String cep;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professores professor;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Cursos curso;
    
    

}
