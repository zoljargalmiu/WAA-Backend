package com.example.demo.service;

import com.example.demo.domain.Student;
import com.example.demo.domain.User;
import com.example.demo.dto.StudentDto;
import com.example.demo.dto.UserDto;
import com.example.demo.helper.ListMapper;
import com.example.demo.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    ModelMapper modelMapper;
    @Autowired
    ListMapper<User,UserDto> listMapperUserToDto;
    @Autowired
    ListMapper<Student, StudentDto> listMapperOrderToDto;

    @Override
    public List<UserDto> getAll() {
        return (List<UserDto>) listMapperUserToDto.mapList(userRepository.findAll(),new UserDto());
    }

    @Override
    public UserDto getById(long id) {
        return modelMapper.map(userRepository.findById(id).orElse(null),UserDto.class);
    }

    @Override
    public void addUser(UserDto user) {
        userRepository.save(modelMapper.map(user,User.class));
    }

//    @Override
//    public List<StudentDto> getOrdersById(long id){
//        return (List<StudentDto>) listMapperOrderToDto.mapList(userRepository.getOrdersById(id),new StudentDto());
//    }
//
//    @Override
//    public List<User> getUsersMoreThan(@RequestParam("num") int num){
//        return userRepository.getUserOrderMoreThan(num);
//    }

    @Override
    public List<User> getUserByName(@RequestParam("name") String name){
        return userRepository.findByName(name) ;
    }

    @Override
    public void deleteById(long id) {
        userRepository.deleteById(id);
    }


}

