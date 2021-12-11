package com.example.demo.repository;

import com.example.demo.domain.Student;
import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

    public List<User> findAll();

//    @Query("select u.orders from User u where u.id = :id")
//    public List<Student> getOrdersById(@Param("id") long id);

    public Optional<User> findByUsername(String username);

//    @Query("select u from User u where u.orders.size > :num")
//    public List<User> getUserOrderMoreThan(@Param("num") int num);

    public List<User> findByName(String name);





}
