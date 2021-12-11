package com.example.demo.repository;

import com.example.demo.domain.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepo extends CrudRepository<Student,Integer> {
//
//    public List<Student> findAll();
//
//    public Optional<Student> findById(long id);
//
//    public List<Student> findAllByTitle(String title);
//
//    public Optional<Student> findByTitle(String title);
//
//
////    @Query(value = "SELECT * FROM POST WHERE AUTHOR = :author", nativeQuery = true)
////    public List<Post> findByAuthor(@Param("author") String author);
//
////    public List<Post> findByAuthor(String author);
//
//    @Query("select o from Student o where o.author = :author")
//    List<Student> findByAuthor(@Param("author") String author);
//

}

