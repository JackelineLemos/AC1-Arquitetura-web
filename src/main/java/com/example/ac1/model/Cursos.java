package com.example.ac1.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Cursos {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (length = 200, nullable = false)
    private String nome;

    @Column (length = 200, nullable = false)
    private String descricao;

    private Integer cargaHoraria;

    @Column (length = 200, nullable = false)
    private String objetivos;

    @Column (length = 200, nullable = false)
    private String ementa;

    @OneToMany(mappedBy = "curso")
    List<Habilitado> habilitado;

    @OneToMany(mappedBy = "curso")
    List<Agenda> agendas;

}
