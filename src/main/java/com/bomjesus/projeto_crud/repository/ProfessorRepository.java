package com.bomjesus.projeto_crud.repository;

import com.bomjesus.projeto_crud.domain.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
