package com.bomjesus.projeto_crud.repository;

import com.bomjesus.projeto_crud.domain.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person, Long> {}
