package com.example.demo.controller;

import com.example.demo.domain.Student;
import com.example.demo.dto.StudentDto;
import com.example.demo.dto.UserDto;
import com.example.demo.service.StudentService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    StudentService studentService;

    @GetMapping
    public List<UserDto> getAll(){
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public UserDto getById(@PathVariable long id){ return userService.getById(id); }

    @PostMapping
    public void addUser(@RequestBody UserDto user){
        userService.addUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") long id){
        userService.deleteById(id);
    }

//    @GetMapping("/{id}/orders")
//    public List<StudentDto> getOrdersUser(@PathVariable long id) { return userService.getOrdersById(id);
//    }

//    @GetMapping("/{id}/orders/{pid}")
//    public Optional<Student> getOneOrdersUser(@PathVariable("pid") int id) { return studentService.findbyid(id);
//    }

    @GetMapping("/admin")
    public String inValidTest2(){
        return "OK";
    }

}
