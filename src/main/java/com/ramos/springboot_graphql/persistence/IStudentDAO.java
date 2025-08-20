package com.ramos.springboot_graphql.persistence;

import com.ramos.springboot_graphql.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudentDAO extends CrudRepository<Student, Long> {
}
