package com.example.demo.service;


import com.example.demo.domain.User;
import com.example.demo.dto.StudentDto;
import com.example.demo.dto.UserDto;

import java.util.List;

public interface UserService {

    public List<UserDto> getAll();

    public UserDto getById(long id);

    public void addUser(UserDto user);

//    public List<StudentDto> getOrdersById(long id);

//    public List<User> getUsersMoreThan( int num);

    public List<User> getUserByName(String name);

    public void deleteById(long id);

}
