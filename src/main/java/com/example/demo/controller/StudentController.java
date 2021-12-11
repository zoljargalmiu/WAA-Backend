package com.example.demo.controller;


import com.example.demo.domain.Student;
import com.example.demo.dto.StudentDto;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @Author Muhyieddin Altarawneh
 *
 */
@CrossOrigin
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    public StudentService studentService;

    @GetMapping
    public List<Student> getAll()
    {
        return studentService.getAll();
    }

    @PostMapping
    public String save(@RequestBody Student student) {
        studentService.save(student);
        return "saved successfully";
    }

    @GetMapping("/find/{id}")
    public Optional<Student> findbyid(@PathVariable int id) {
        return studentService.findbyid(id);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public String update(@PathVariable int id, @RequestBody Student student) {

        studentService.update(id,student);

        return "Successfully updated!";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable int id) {

        studentService.delete(id);

        return "Successfully deleted!";
    }
}
