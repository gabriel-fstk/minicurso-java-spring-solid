package br.edu.ifrs.minicurso.springsolidapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifrs.minicurso.springsolidapi.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer>{
    
}
