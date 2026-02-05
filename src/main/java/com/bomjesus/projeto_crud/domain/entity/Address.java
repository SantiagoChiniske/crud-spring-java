package com.bomjesus.projeto_crud.domain.entity;

import jakarta.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String County;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;
}
