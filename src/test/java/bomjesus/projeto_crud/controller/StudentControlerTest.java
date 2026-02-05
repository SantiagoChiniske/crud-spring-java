package com.bomjesus.projeto_crud.controller;

import com.bomjesus.projeto_crud.domain.entity.Student;
import com.bomjesus.projeto_crud.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

class StudentControlerTest {

    @Test
    void shouldCreateStudent() {


        StudentRepository repository = Mockito.mock(StudentRepository.class);

        Student student = new Student();
        student.setName("Augusto de Melo");
        student.setPhoneNumber("12999999999");
        student.setEmailAddress("Augusto.chiniske@email.com");
        student.setStudentNumber("A12343323");
        student.setPhoto("foto.png");

        Mockito.when(repository.save(any(Student.class)))
                .thenReturn(student);

        StudentControler controller = new StudentControler(repository);

        ResponseEntity<Student> response = controller.create(student);

        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertNotNull(response.getBody());
        assertEquals("Augusto de Melo", response.getBody().getName());
        assertEquals("A12343323", response.getBody().getStudentNumber());
    }
}
