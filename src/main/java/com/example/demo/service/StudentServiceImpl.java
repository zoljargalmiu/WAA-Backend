package com.example.demo.service;


import com.example.demo.domain.Student;

import com.example.demo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public List<Student> getAll() {
        return (List<Student>) studentRepo.findAll();
    }

    @Override
    public void save(Student student) {
        studentRepo.save(student);
    }

    @Override
    public void update(int id, Student student) {
        Optional<Student> studentData = studentRepo.findById(id);
        if(studentData != null)
        {
            student.setId(id);
            studentRepo.save(student);
        }
    }

    @Override
    public void delete(int id) {
        Optional<Student> studentData = studentRepo.findById(id);
        if(studentData != null)
        {
            studentRepo.delete(studentData.get());
        }
    }

    @Override
    public Optional<Student> findbyid(int id) {
        return studentRepo.findById(id);
    }
}
