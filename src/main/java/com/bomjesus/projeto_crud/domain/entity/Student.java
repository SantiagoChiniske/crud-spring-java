package com.bomjesus.projeto_crud.domain.entity;

import com.bomjesus.projeto_crud.domain.Status;
import jakarta.persistence.Entity;

@Entity
public class Student extends Person {

    private String studentNumber;
    private String photo;

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
