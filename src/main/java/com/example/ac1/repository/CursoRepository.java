package com.example.ac1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.ac1.model.Cursos;
import com.example.ac1.model.Professores;

public interface CursoRepository extends JpaRepository<Cursos, Long>{

    @Query ("select p.professor  from Habilitado h inner join Professor p on p.id = h.professor_id where id = ???")
    List<Professores> findProfesorFetchCursos(@Param("id") Long id);
}
