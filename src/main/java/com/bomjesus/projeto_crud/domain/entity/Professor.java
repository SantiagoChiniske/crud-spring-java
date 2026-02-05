package com.bomjesus.projeto_crud.domain.entity;

import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity
public class Professor extends Person {
    private BigDecimal salary;
}
