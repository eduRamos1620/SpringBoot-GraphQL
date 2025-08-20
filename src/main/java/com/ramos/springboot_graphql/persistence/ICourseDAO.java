package com.ramos.springboot_graphql.persistence;

import com.ramos.springboot_graphql.entities.Course;
import org.springframework.data.repository.CrudRepository;


public interface ICourseDAO extends CrudRepository<Course, Long> {
}
