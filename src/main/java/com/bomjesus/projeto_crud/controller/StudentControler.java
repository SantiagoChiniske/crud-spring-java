package com.bomjesus.projeto_crud.controller;

import com.bomjesus.projeto_crud.domain.entity.Student;
import com.bomjesus.projeto_crud.repository.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentControler {
    private final StudentRepository repository;

    public StudentControler(StudentRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<Student> create(@RequestBody Student student) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(repository.save(student));
    }

    @GetMapping
    public List<Student> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> findById(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> update(
            @PathVariable Long id,
            @RequestBody Student student) {

        return repository.findById(id)
                .map(existing -> {
                    existing.setName(student.getName());
                    existing.setPhoneNumber(student.getPhoneNumber());
                    existing.setEmailAddress(student.getEmailAddress());
                    existing.setStatus(student.getStatus());
                    existing.setStudentNumber(student.getStudentNumber());
                    existing.setPhoto(student.getPhoto());

                    return ResponseEntity.ok(repository.save(existing));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
