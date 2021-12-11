package com.example.demo.dto;

import com.example.demo.domain.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    long id;
    String name;
//    List<Student> students;
}
