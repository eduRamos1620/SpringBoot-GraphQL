package com.ramos.springboot_graphql.services;

import com.ramos.springboot_graphql.entities.Course;

import java.util.List;

public interface ICourseService {

    Course findById(Long id);

    List<Course> findAll();

    void createCourse(Course course);

    void deleteById(Long id);
}
