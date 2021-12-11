package com.example.demo.service;


import com.example.demo.domain.Student;
import com.example.demo.dto.StudentDto;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> getAll();

    void save(Student student);

    void update(int id, Student student);

    void delete(int id);

    Optional<Student> findbyid(int id);
}

