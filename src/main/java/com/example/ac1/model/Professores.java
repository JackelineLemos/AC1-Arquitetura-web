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

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Professores {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (length = 200, nullable = false)
    private String nome;

    @Column (length = 200, nullable = false)
    private String cpf;

    @Column (length = 200, nullable = false)
    private String rg;

    @Column (length = 200, nullable = false)
    private String celular;
    
    @OneToMany(mappedBy = "professor")
    List<Habilitado> professorHabilitado;

    @OneToMany(mappedBy = "professor")
    List<Agenda> agendas;


}
