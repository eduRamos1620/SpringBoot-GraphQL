package com.ramos.springboot_graphql.services;

import com.ramos.springboot_graphql.entities.Student;

import java.util.List;

public interface IStudentService {

    Student findById(Long id);

    List<Student> findAll();

    void createStudent(Student student);

    void deleteById(Long id);
}
