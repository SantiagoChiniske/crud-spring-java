package com.bomjesus.projeto_crud.repository;

import com.bomjesus.projeto_crud.domain.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {}